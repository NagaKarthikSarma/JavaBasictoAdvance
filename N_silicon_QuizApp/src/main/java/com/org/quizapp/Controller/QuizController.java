package com.org.quizapp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.org.quizapp.entity.QuestionQuiz;
import com.org.quizapp.entity.QuestionWrapper;
import com.org.quizapp.entity.Response;
import com.org.quizapp.service.QuizService;
 

@RestController
@RequestMapping("/quiz") 
public class QuizController {
	@Autowired
	QuizService quizservice;
	
	@PostMapping("create")
	public ResponseEntity<String> createQuiz(@RequestParam String category,@RequestParam int numQ, @RequestParam String title){
		
		return quizservice.createQuiz(category,numQ,title);
	}
	@GetMapping("get/{id}")
	public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(@PathVariable int id){
		
		
		return  quizservice.getQuestionQuiz(id);
		
	}
	@PostMapping("submit/{id}") 
	
	public ResponseEntity<Integer> submitQuiz(@PathVariable Integer id, @RequestBody List<Response> response ){
		
		return quizservice.calculateResult(id,response);
	}
}
