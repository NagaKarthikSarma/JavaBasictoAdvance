package com.org.question.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.org.question.Dao.QuestionDao;
import com.org.question.entity.QuestionQuiz;
import com.org.question.entity.QuestionWrapper;
import com.org.question.entity.Response;


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

	public ResponseEntity<List<Integer>> getQuestionsForQuiz(String category, int numQu) {
	
		List<Integer> questions = dao.findRandomQuestionsByCategory(category,numQu);
		return new ResponseEntity<>(questions,HttpStatus.OK);
	}

	public ResponseEntity<List<QuestionWrapper>> getQuestionsFromIds(List<Integer> questionIds) {
		List<QuestionWrapper> wrappers = new ArrayList<>();
		List<QuestionQuiz> questions = new ArrayList<>();
		
		for(Integer id : questionIds) {
			questions.add(dao.findById(id));
		}
		for(QuestionQuiz question : questions) {
			
			QuestionWrapper wrapper = new QuestionWrapper();
			wrapper.setId(question.getId());
			wrapper.setQuesion(question.getQuesion());
			wrapper.setOption1(question.getOption1());
			wrapper.setOption2(question.getOption2());
			wrapper.setOption3(question.getOption3());
			wrapper.setOption4(question.getOption4());
			
			wrappers.add(wrapper);
			
		}
		
		return new ResponseEntity<>(wrappers,HttpStatus.OK);
	}

	public ResponseEntity<Integer> getScore(List<Response> responses) {
		
	int right=0;
	
	for(Response response: responses) {
		QuestionQuiz question = dao.findById(response.getId());
	
		if(response.getResponse().equals(question.getRightanswer()))
			right++;
	}
		
		return new ResponseEntity<>(right,HttpStatus.OK) ;
	}


}
