package com.brige.app.persistence;

import com.brige.app.domain.UserVO;

public interface UserDAO {

	public UserVO readLogin(String userid, String userpw) throws Exception;
	public UserVO searchId(String username, String userbirthday) throws Exception;
	
}
