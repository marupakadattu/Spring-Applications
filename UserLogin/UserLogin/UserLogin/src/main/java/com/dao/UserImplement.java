package com.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.model.UserMap;
import com.model.UserReg;

public class UserImplement implements LoginUser{
	private DataSource dataSource;
	   private JdbcTemplate jdbcTemplateObject;
	   
	   public void setDataSource(DataSource dataSource) {
	      this.dataSource = dataSource;
	      this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	   }
	   public void create(UserReg user) {
	      String SQL = "insert into user (userid,uname,password,email,phonenumber)  values (?,?,?,?,?)";
	      jdbcTemplateObject.update(SQL,user.getUserid(),user.getUname(),user.getPassword(),user.getEmail(),user.getPhonenumber());
	      System.out.println("Created Record Name = " + user.getUname() + " Email = " + user.getEmail() + " Phone Number = " + user.getPhonenumber() );
	      
	   }
		   
	   public UserReg getUser(Integer userid) {
	      String SQL = "select * from user where userid = ?";
	      UserReg student = jdbcTemplateObject.queryForObject(SQL, 
	         new Object[]{userid}, new UserMap());
	      
	      return student;
	   }
	   public List<UserReg> listUser() {
	      String SQL = "select * from user";
	      List <UserReg> students = jdbcTemplateObject.query(SQL, new UserMap());
	      return students;
	   }
	   public void delete(Integer userid) {
	      String SQL = "delete from user where userid = ?";
	      jdbcTemplateObject.update(SQL, userid);
	      System.out.println("Deleted Record with ID = " + userid );
	      return;
	   }
	   public void update(Integer uid, String uname, String password, String email, String phonenumber){
	      String SQL = "update user  set uname = ?, password ?, email = ?, phonenumber = ?  where uid = ?";
	      jdbcTemplateObject.update(SQL, uname, password, email, phonenumber );
	      System.out.println("Updated Record with ID = " + uid );
	      return;
	   }
	

}
