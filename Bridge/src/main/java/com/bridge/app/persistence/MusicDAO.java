package com.bridge.app.persistence;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.bridge.app.domain.MusicVO;

public interface MusicDAO {
	public void regist(HttpServletRequest req) throws Exception;
	public void remove(Integer musicnumber) throws Exception;
	public void modify(MusicVO music) throws Exception;
	
	public List<MusicVO> searchAll() throws Exception;
	public MusicVO search() throws Exception;	
}
