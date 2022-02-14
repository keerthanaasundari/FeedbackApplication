package com.project.feedback.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.feedback.repository.FeedbackRepository;

@Service
public class FeedbackService {

	
	@Autowired
	private FeedbackRepository feedabackbackRepository;
	
	public String checkLogin(String userName, String password, String secret) {
		return null;
	}

	public String checksignUp(String userName, String password, String secret) {
		return null;
	}

}
