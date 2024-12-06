package com.org.quizapp.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.org.quizapp.entity.QuestionWrapper;
import com.org.quizapp.entity.Response;

@FeignClient("QUESTION-SERVICE")
public interface QuizInterface {
	
	@GetMapping("question/generate")
	public ResponseEntity<List<Integer>> getQuestionsForQuiz
	(@RequestParam String category, @RequestParam int numQu);

	@PostMapping("question/getQuestions")
		public ResponseEntity<List<QuestionWrapper>> getQuestionsFromId
		(@RequestBody List<Integer> questionIds);

	@PostMapping("question/getScore")
	public ResponseEntity<Integer> getScore
	(@RequestBody List<Response> responses);


}
