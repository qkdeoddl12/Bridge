
package com.bridge.app.controller;

import java.sql.SQLException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class userController {
	@RequestMapping("/user.add")
public ModelAndView requestHandler(){
		
		ModelAndView mav = new ModelAndView("/user/user");
		
		return mav;
	}
}
