package com.SpringBootAI.service;

import org.springframework.ai.chat.model.ChatModel;
import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.chat.prompt.PromptTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBootAI.model.Answer;
import com.SpringBootAI.model.Question;

@Service
public class OpenAIService {
	
	@Autowired
	private ChatModel chatModel;
	
	public Answer getResult(Question question) {
		try {
			if (question == null || question.question() == null || question.question().trim().isEmpty()) {
				return new Answer("Invalid question provided!!");
			}

			Prompt prompt = new PromptTemplate(question.question()).create();
			ChatResponse response = chatModel.call(prompt);

			if (response != null && !response.getResults().isEmpty() && response.getResults().get(0).getOutput() != null) {
				String text = response.getResults().get(0).getOutput().getText();
				if (text != null && !text.trim().isEmpty()) {
					return new Answer(text.trim());
				}
			}
			return new Answer("No response received!!");

		} catch (Exception e) {
			return new Answer("Error while connecting to AI model: " + e.getMessage());
		}
	}
}
