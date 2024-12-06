package com.org.quizapp.entity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
public class Quiz {

	@Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String title;
	@ManyToMany
	private List<QuestionQuiz> question;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<QuestionQuiz> getQuestion() {
		return question;
	}
	public void setQuestion(List<QuestionQuiz> question) {
		this.question = question;
	}
	public Quiz(int id, String title, List<QuestionQuiz> question) {
		super();
		this.id = id;
		this.title = title;
		this.question = question;
	}
	public Quiz() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Quiz [id=" + id + ", title=" + title + ", question=" + question + "]";
	}
	
	

	
}
