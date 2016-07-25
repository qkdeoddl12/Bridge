package com.brige.app.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.brige.app.domain.UserVO;

@Repository
public class UserDAOImpl implements UserDAO {

	@Inject
	private SqlSession SqlSession;
	
	private static final String NAMESPACE="com.brige.mappers.UserMapper";
	
	
	@Override
	public void insertUser(UserVO vo) throws Exception {
		SqlSession.insert(NAMESPACE + ".insertUser", vo);

	}


	@Override
	public UserVO readUser(String userId) throws Exception {
		// TODO Auto-generated method stub
		return (UserVO)SqlSession.selectOne(NAMESPACE + ".readUser");
	}

}
