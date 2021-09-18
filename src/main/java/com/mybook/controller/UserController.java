package com.mybook.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mybook.entity.User;

@RestController
@RequestMapping("/getUser")
public class UserController {
	
	@GetMapping
	public Object getUser() {
		return "Getting User";
	}
}
