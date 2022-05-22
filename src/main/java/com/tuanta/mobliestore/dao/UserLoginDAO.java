package com.tuanta.mobliestore.dao;

import javax.sql.DataSource;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.tuanta.mobliestore.mapper.UserLoginMapper;
import com.tuanta.mobliestore.model.UserLogin;

@Repository
public class UserLoginDAO extends JdbcDaoSupport {

	public UserLoginDAO(DataSource dataSource) {
		this.setDataSource(dataSource);
	}

	public UserLogin findUser(String userName, String password) {
		String sql = "SELECT User_Name, Full_Name, Password, Role_ID FROM tblUser"
				+ " WHERE User_Name LIKE ? AND Password LIKE ?";
		Object[] params = new Object[] { userName, password };
		UserLoginMapper mapper = new UserLoginMapper();
		try {
			UserLogin userLogin = this.getJdbcTemplate().queryForObject(sql, params, mapper);
			return userLogin;
		} catch (EmptyResultDataAccessException e) {
			return null;
		}
	}
}
