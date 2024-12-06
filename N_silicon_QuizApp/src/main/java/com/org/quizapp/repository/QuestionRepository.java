package com.org.quizapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.org.quizapp.entity.QuestionQuiz;

public interface QuestionRepository extends JpaRepository<QuestionQuiz, Integer>{

	public List<QuestionQuiz> getBycategory(String category);

	 @Query(value = "SELECT q.id FROM question_quiz as q WHERE q.category = :category ORDER BY RAND() LIMIT :numQ", nativeQuery = true)
	public List<QuestionQuiz> findRandomQuestionsByCategory(String category,int numQ);
}
