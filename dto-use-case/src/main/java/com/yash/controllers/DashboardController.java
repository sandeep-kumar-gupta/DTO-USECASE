package com.yash.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.yash.dtos.CountDto;
import com.yash.dtos.UserDto;
import com.yash.entities.User;
import com.yash.services.DashboardService;
import com.yash.services.UserService;

@RestController
@RequestMapping("/dashboard")
public class DashboardController {

	@Autowired
	private UserService userservice;

	@Autowired
	private DashboardService dashboardService;

	@GetMapping("/get-user-info")
	public ResponseEntity<User> getUserInfo(@RequestParam("username") String username) {
		User user = userservice.getUserInfo(username);
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}

	@GetMapping("/get-data")
	@ResponseBody
	public String getData(@RequestParam("username") String username) {

		return username;
	}

	@GetMapping("/get-required-user-info")
	public ResponseEntity<UserDto> getRequiredUserInfo(@RequestParam("username") String username) {
		return new ResponseEntity<UserDto>(userservice.partialUserInfo(username), HttpStatus.OK);
	}

	@GetMapping("/get-count-for-dashboard")
	public ResponseEntity<CountDto> getcountForDashboard() {
		return new ResponseEntity<CountDto>(dashboardService.getCountForDashBoard(), HttpStatus.OK);
	}

}
