package com.org.question.Dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.org.question.entity.QuestionQuiz;
import com.org.question.repository.QuestionRepository;

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

	public List<Integer> findRandomQuestionsByCategory(String category, int numQu) {
		return repo.findRandomQuestionsByCategory(category, numQu);
	}

	public QuestionQuiz findById(Integer id) {
	
		return repo.findById(id).get();
	}

	

	

}
