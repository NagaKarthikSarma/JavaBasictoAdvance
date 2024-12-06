package com.org.quizapp.entity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
public class Quiz {

	@Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String title;
	@ElementCollection
	private List<Integer> question;
	
	
	
}
