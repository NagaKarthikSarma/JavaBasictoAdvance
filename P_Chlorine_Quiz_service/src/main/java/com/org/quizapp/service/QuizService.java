package com.org.quizapp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.org.quizapp.Dao.QuizDao;

import com.org.quizapp.entity.QuestionWrapper;
import com.org.quizapp.entity.Quiz;
import com.org.quizapp.entity.Response;

@Service
public class QuizService {
	
	@Autowired
	QuizDao quizDao;
	
	@Autowired
	QuizInterface quizInterface;
	

//	
//	RestTemplate

	public ResponseEntity<String> createQuiz(String category, int numQ, String title) {
	
		List<Integer> questions =quizInterface.getQuestionsForQuiz(category, numQ).getBody();
				
				// call the generate URL --> RestTemplate will works to call 
				    // the one microservice to another
				//questionDao.findRandomQuestionsByCategory(category,numQ);
		Quiz quiz = new Quiz();
	
		quiz.setTitle(title);
		quiz.setQuestion(questions);
		quizDao.save(quiz);
		return new ResponseEntity<>("success", HttpStatus.CREATED);
	}



	public ResponseEntity<List<QuestionWrapper>> getQuestionQuiz(int id) {
	
		Quiz quiz=	quizDao.findById(id).get();
		
		
		List<Integer> questionIds = quiz.getQuestion();	
		
		ResponseEntity<List<QuestionWrapper>>  questions = quizInterface.getQuestionsFromId(questionIds);
		return questions;
	}



	public ResponseEntity<Integer> calculateResult(Integer id, List<Response> response) {
     
		    ResponseEntity<Integer> score = quizInterface.getScore(response);

		return score;
	}
	
	
	

}
