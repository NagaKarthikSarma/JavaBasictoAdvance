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
import org.springframework.web.bind.annotation.RestController;

import com.org.quizapp.entity.QuestionQuiz;
import com.org.quizapp.service.QuestionService;

@RestController
@RequestMapping("/question")
public class QuestionController {

	@Autowired
	QuestionService service;
	
	@GetMapping("allquestions")
	public ResponseEntity<List<QuestionQuiz>> getAllQuestion() {
	
		return (service.getAllQuestion());
	}
	
	@GetMapping("category/{catogory}")
	public ResponseEntity<List<QuestionQuiz>> getQuestionByCatogery(@PathVariable String catogory){
		
		
		return service.getQuestionsByCatogery(catogory);
		
	}
	
	@GetMapping("param")
	public String parm(@RequestParam String param) {
		
		return param;
	}
	
	
	@PostMapping("add")

public ResponseEntity<String> addQuestion(@RequestBody QuestionQuiz quiz ){

		
         return service.save(quiz);
	}
	

}
