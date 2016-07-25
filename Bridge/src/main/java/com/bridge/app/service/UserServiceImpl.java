package com.bridge.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridge.app.domain.UserVO;
import com.bridge.app.persistence.UserDAO;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDAO dao;
	

	@Override
	public UserVO readLogin(String userid, String userpw) throws Exception {
		// 컨트롤러와 dao를 연결해줌
		System.out.println("서비스");
		return (UserVO)dao.readLogin(userid, userpw);
	}


	@Override
	public UserVO searchId(String username, String userbirthday) throws Exception {
		// 아이디를 찾음
		System.out.println("id 찾음");
		return dao.searchId(username, userbirthday);
	}






}
