package com.org.quizapp.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.quizapp.entity.Quiz;

public interface QuizDao extends JpaRepository<Quiz, Integer> {

}
