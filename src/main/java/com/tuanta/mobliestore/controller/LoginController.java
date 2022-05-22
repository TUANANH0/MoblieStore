package com.tuanta.mobliestore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tuanta.mobliestore.dao.UserLoginDAO;
import com.tuanta.mobliestore.model.UserLogin;

@Controller
public class LoginController {
	@RequestMapping(value = "/")
	public String LoginUser(Module model) {
		return "login";
	}
}
