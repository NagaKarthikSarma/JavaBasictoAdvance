package com.org.quizapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.org.quizapp.Dao.QuestionDao;
import com.org.quizapp.entity.QuestionQuiz;


@Service
public class QuestionService {
	
	@Autowired
	QuestionDao dao;

	public ResponseEntity<List<QuestionQuiz>> getAllQuestion() {
		
		try {
			return new ResponseEntity<>(dao.findAll(),HttpStatus.OK);
		}
		
		
		catch(Exception e) {
			
			e.printStackTrace();
			
			return new ResponseEntity<>(new ArrayList<>(),HttpStatus.BAD_REQUEST);
		}
	}

	public ResponseEntity<List<QuestionQuiz>> getQuestionsByCatogery(String category) {
		
		try {
			return new ResponseEntity<>( dao.findByCatogery(category),HttpStatus.OK);
		}
	catch(Exception e) {
		e.printStackTrace();
		return new ResponseEntity<>( new ArrayList<>(),HttpStatus.BAD_REQUEST);
	}
	}

	public ResponseEntity<String>  save(QuestionQuiz quiz) {
		dao.save(quiz);
		
		try {
			return new ResponseEntity<>("succesful",HttpStatus.CREATED) ;
			
		}
	catch(Exception e) {
		return new ResponseEntity<>("Not created", HttpStatus.NOT_ACCEPTABLE) ;
		
	}
	}
	

}
