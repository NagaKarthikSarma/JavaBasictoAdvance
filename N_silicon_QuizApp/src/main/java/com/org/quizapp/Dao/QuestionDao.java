package com.org.quizapp.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.org.quizapp.entity.QuestionQuiz;
import com.org.quizapp.repository.QuestionRepository;

@Repository
public class QuestionDao {
	
	@Autowired
	QuestionRepository repo;
	
	public List<QuestionQuiz> findAll() {
		
		return repo.findAll();
	}

	public List<QuestionQuiz> findByCatogery(String category) {
	
		return repo.getBycategory(category);
	}

	public void save(QuestionQuiz quiz) {
		repo.save(quiz);
		
	}

	public List<QuestionQuiz> findRandomQuestionsByCategory(String category,int numQ) {
	
		return repo.findRandomQuestionsByCategory(category,numQ);
	}

}
