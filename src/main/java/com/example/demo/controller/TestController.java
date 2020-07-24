package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@Controller
@RequestMapping("/test")
public class TestController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/say",method = RequestMethod.GET)
	public String index() {
			List<User> userList = userService.findAlll();
			System.out.print(userList.get(0).getUsername());
			return "index";
		}
}