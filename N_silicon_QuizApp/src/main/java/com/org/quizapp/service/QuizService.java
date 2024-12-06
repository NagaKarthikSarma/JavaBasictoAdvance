package com.org.quizapp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.org.quizapp.Dao.QuestionDao;
import com.org.quizapp.Dao.QuizDao;
import com.org.quizapp.entity.QuestionQuiz;
import com.org.quizapp.entity.QuestionWrapper;
import com.org.quizapp.entity.Quiz;
import com.org.quizapp.entity.Response;

@Service
public class QuizService {
	
	@Autowired
	QuizDao quizDao;
	
	@Autowired
	QuestionDao questionDao;
	
	

	public ResponseEntity<String> createQuiz(String category, int numQ, String title) {
	
		List<QuestionQuiz> questions = questionDao.findRandomQuestionsByCategory(category,numQ);
		Quiz quiz = new Quiz();
		quiz.setTitle(title);
		quiz.setQuestion(questions);
		quizDao.save(quiz);
		return new ResponseEntity<>("success", HttpStatus.CREATED);
	}



	public ResponseEntity<List<QuestionWrapper>> getQuestionQuiz(int id) {
	
		Optional<Quiz> quiz=	quizDao.findById(id);

		List<QuestionQuiz> questionfromDB = quiz.get().getQuestion();
		
		List<QuestionWrapper> questionforuser = new ArrayList<>();
		for(QuestionQuiz q: questionfromDB) {
			QuestionWrapper qw = new  QuestionWrapper(q.getId(),q.getQuesion(),q.getOption1(),q.getOption2(),q.getOption3(),q.getOption4());
			questionforuser.add(qw);
		}
		
		return new ResponseEntity<>(questionforuser,HttpStatus.OK);
	}



	public ResponseEntity<Integer> calculateResult(Integer id, List<Response> response) {
	
		//Optional<Quiz> quiz = quizDao.findById(id);
	Quiz quiz = quizDao.findById(id).get();
		
		List<QuestionQuiz> questions = quiz.getQuestion();
		int right =0;
	  int i=0;
	  
		for (Response resp : response) {
			if (resp.getResponse().equals(questions.get(i).getRightanswer())) {
			right++;	
			}
			i++;
		}
		
		return new ResponseEntity<>(right,HttpStatus.OK);
	}
	
	
	

}
