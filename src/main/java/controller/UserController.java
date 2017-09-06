package controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import service.UserService;


@Controller
public class UserController {
	@Resource
	private UserService userService;
	
	@RequestMapping(value="/getAllUsers.do",produces = "application/json; charset=utf-8")
	@ResponseBody
	public Object getAllUsers(){
		return userService.getAllUsers().toString();
	}
	
}
