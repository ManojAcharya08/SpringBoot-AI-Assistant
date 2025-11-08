package com.SpringBootAI.controller;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBootAI.model.Answer;
import com.SpringBootAI.model.Question;
import com.SpringBootAI.service.OpenAIService;

@RestController
@RequestMapping("/api/openai")
public class OpenAIController {
	
	@Autowired
	private OpenAIService openAIService;
	
	@PostMapping
	public Answer getAnswer(@RequestBody Question question) {
		return openAIService.getResult(question);
	}
}
