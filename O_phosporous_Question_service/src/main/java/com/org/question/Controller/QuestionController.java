package com.org.question.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.org.question.entity.QuestionQuiz;
import com.org.question.entity.QuestionWrapper;
import com.org.question.entity.Response;
import com.org.question.service.QuestionService;

@RestController
@RequestMapping("/question")
public class QuestionController {
	
	@Autowired
	Environment environment;

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
	// we need
//generate
	//getQuestion(id)
	//getScore
	
@GetMapping("generate")
public ResponseEntity<List<Integer>> getQuestionsForQuiz(@RequestParam String category, @RequestParam int numQu) {
	
	
	return service.getQuestionsForQuiz(category,numQu);
}

@PostMapping("getQuestions")
	public ResponseEntity<List<QuestionWrapper>> getQuestionsFromId(@RequestBody List<Integer> questionIds){
	
	System.out.println("-----------------   " + environment.getProperty("local.server.port"));
	
	return service.getQuestionsFromIds(questionIds);
}

@PostMapping("getScore")
public ResponseEntity<Integer> getScore(@RequestBody List<Response> responses){
	
	return service.getScore(responses);
	
}


}

