package com.yash.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.dtos.UserDto;
import com.yash.entities.User;
import com.yash.repos.UserRepo;

@Service
public class UserService {

	@Autowired
	private UserRepo userRepo;
	

	public User getUserInfo(String username) {
		return userRepo.findById(username).get();
	}
	
	
	public UserDto partialUserInfo(String username) {
		List<Object[]> userInfoResp = userRepo.getUserInfo(username); 
		 return new UserDto(userInfoResp.get(0)[0].toString(),userInfoResp.get(0)[1].toString());
	}
	
	public List<Object[]> partialUserInfo1(String username) {
		List<Object[]> userInfoResp = userRepo.getUserInfo(username); 
		 return userInfoResp;
	}
}
