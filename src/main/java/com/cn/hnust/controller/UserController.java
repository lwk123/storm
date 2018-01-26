package com.cn.hnust.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import cn.com.domain.City;
import cn.com.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cn.hnust.pojo.User;
import com.cn.hnust.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private IUserService userService;

	private CityService cityService;
	
	@RequestMapping("/showUser")
	public String toIndex(HttpServletRequest request,Model model){
		model.addAttribute("user", 123);
		return "showUser";
	}

	@RequestMapping("/getCity")
	public City getCity(){
		City city = cityService.findCityByName("123");
		return city;
	}
}
