package com.quizapp.quizapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.quizapp.quizapp.Question;
import com.quizapp.quizapp.dao.QuestionDao;

@Service
public class QuestionService {
	
	@Autowired
	QuestionDao questionDao;
	
	public List<Question> getAllQuestions() {
		return questionDao.findAll();
	}
}
