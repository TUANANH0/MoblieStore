package com.tuanta.mobliestore.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.tuanta.mobliestore.model.UserLogin;

public class UserLoginMapper implements RowMapper<UserLogin> {

	String sql = "SELECT username, fullname, password, roleID FROM tblUser";

	@Override
	public UserLogin mapRow(ResultSet rs, int rowNum) throws SQLException {
		String userName = rs.getString("username");
		String fullName = rs.getString("fullname");
		String password = rs.getString("password");
		int roleID = rs.getInt("roleID");
		return new UserLogin(userName, fullName, password, roleID);
	}
}
