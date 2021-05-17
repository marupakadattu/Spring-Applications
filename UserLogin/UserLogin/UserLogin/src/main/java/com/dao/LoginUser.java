package com.dao;

import java.util.List;

import javax.sql.DataSource;

import com.model.UserReg;

public interface LoginUser {
	public void setDataSource(DataSource ds);
	   
	   /** 
	      * This is the method to be used to create
	      * a record in the Student table.
	   */
	   public void create(UserReg user);
	   
	   /** 
	      * This is the method to be used to list down
	      * a record from the Student table corresponding
	      * to a passed student id.
	   */
	   public UserReg getUser(Integer uid);
	   
	   /** 
	      * This is the method to be used to list down
	      * all the records from the Student table.
	   */
	   public List<UserReg> listUser();
	   
	   /** 
	      * This is the method to be used to delete
	      * a record from the Student table corresponding
	      * to a passed student id.
	   */
	   public void delete(Integer userid);
	   
	   /** 
	      * This is the method to be used to update
	      * a record into the Student table.
	   */
	   public void update(Integer userid, String name, String password, String email, String phonenumber);

}
