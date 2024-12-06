package com.org.question.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.org.question.entity.QuestionQuiz;

public interface QuestionRepository extends JpaRepository<QuestionQuiz, Integer>{

	public List<QuestionQuiz> getBycategory(String category);

	 @Query(value = "SELECT * FROM question_quiz WHERE category = :category ORDER BY RAND() LIMIT :numQ", nativeQuery = true)
	public List<Integer> findRandomQuestionsByCategory(String category,int numQ);
}
