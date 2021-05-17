package com.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;


public class UserMap implements RowMapper<UserReg> {
	   public UserReg mapRow(ResultSet rs, int rowNum) throws SQLException {
		   UserReg user = new UserReg();
		   user.setUname(rs.getString("uname"));
		   user.setPassword(rs.getString("password"));
		   user.setEmail(rs.getString("email"));
		   user.setPhonenumber(rs.getString("phonenumber"));
		      
		      return user;
		   } 

}
