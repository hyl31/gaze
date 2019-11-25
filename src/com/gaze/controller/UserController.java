package com.gaze.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gaze.biz.UserBiz;
import com.gaze.entity.User;

@Controller
public class UserController {

	@Autowired
	private UserBiz userBiz;

	@RequestMapping("/login")
	public String login(
			@RequestParam("userphone") String userphone, 
			@RequestParam("password") String password,
			HttpServletRequest request,
			HttpServletResponse response) {
			
		User user =userBiz.getUser(userphone, password);
		if(user == null) {
			throw new RuntimeException("用户名或密码错误！");
		} 
		request.getSession().setAttribute("login", user);
		return "index";
	}
	
	
	
	@ExceptionHandler(value= {RuntimeException.class})
	public String handlerException(
			RuntimeException re ,HttpServletRequest request
			) {
		request.setAttribute("msg", re.getMessage());
		return "error";  
	}
	
	@RequestMapping("/checkName")
	@ResponseBody  //将方法执行结果直接输出到页面上
	public String checkName(String userphone){
		User user = userBiz.getByName(userphone);
		String message ="{\"msg\":\"false\"}";
		
		if(user == null){//可用
			message ="{\"msg\":\"true\"}";
		}
		return message;
	}
	
	@RequestMapping("/regist")
	public String regist(User user){
		System.out.println("注册信息:"+user.getUserphone()+","+user.getPassword());
		
		return "";
	}
}
