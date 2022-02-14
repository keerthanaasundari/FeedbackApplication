package com.project.feedback.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.project.feedback.model.User;
import com.project.feedback.service.FeedbackService;

@RestController("/feedback")
public class FeedbackController {
    
	@Autowired
	private FeedbackService feedbackService;
	
	@GetMapping("/")
	public ModelAndView loginHome() {
		
		return new ModelAndView("LogIn");
	}
	@PostMapping("/login")
	public String login(User user) {
	  return feedbackService.checkLogin(user.getUserName(),user.getPassword(),user.getSecret());	
		
	}
	@PostMapping("/signUp")
    public String signUp(User user) {
		return feedbackService.checksignUp(user.getUserName(),user.getPassword(),user.getSecret());	
		
	}
	
}
