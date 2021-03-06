/*
 * 작성자 - 조일선
 * 내용 - 가수 댓글 컨트롤러
 * 시작날짜 - 2016/07/20
 * 수정날짜 - 
 * 변경내용 - 
 */
package com.bridge.app.controller;

import java.util.HashMap;
import java.util.List;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.bridge.app.domain.ArtistReplyVO;
import com.bridge.app.service.ArtistReplyService;

@Controller
public class ArtistReplyController {
	@Autowired
	private ArtistReplyService service;
	
	@RequestMapping(value="replyWrite")
	@ResponseBody
	public String replyWrite(@ModelAttribute ArtistReplyVO vo) throws Exception{	
		vo.setUserNumber(2);
		service.writeReply(vo);
		if(vo.getReplyNumber()==0)
			service.updateReplyGroupNumber();
		return "success";
	}
	
	@RequestMapping(value="getReplyList")	
	@ResponseBody
	public List<ArtistReplyVO> getReplyList(@RequestParam int start, int end) throws Exception{
		System.out.println(start);
		System.out.println(end);
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("start", start);
		map.put("end", end);
		return service.getReplyList(map);
	}
	
	@RequestMapping(value="deleteReply")	
	@ResponseBody
	public String deleteReply(@Valid int replyNumber) throws Exception{			
		service.deleteReply(replyNumber);
		return "success";
	}
	
}
