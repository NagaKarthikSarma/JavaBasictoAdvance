package com.org.question.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "question_quiz")
public class QuestionQuiz {

	@Id
	private Integer id;
	private String category;
	private String difficultlevel;
	private String quesion;
	private String option1;
	private String option2;
	private String option3;
	private String option4;
	private String rightanswer;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDifficultlevel() {
		return difficultlevel;
	}
	public void setDifficultlevel(String difficultlevel) {
		this.difficultlevel = difficultlevel;
	}
	public String getQuesion() {
		return quesion;
	}
	public void setQuesion(String quesion) {
		this.quesion = quesion;
	}
	public String getOption1() {
		return option1;
	}
	public void setOption1(String option1) {
		this.option1 = option1;
	}
	public String getOption2() {
		return option2;
	}
	public void setOption2(String option2) {
		this.option2 = option2;
	}
	public String getOption3() {
		return option3;
	}
	public void setOption3(String option3) {
		this.option3 = option3;
	}
	public String getOption4() {
		return option4;
	}
	public void setOption4(String option4) {
		this.option4 = option4;
	}
	public String getRightanswer() {
		return rightanswer;
	}
	public void setRightanswer(String rightanswer) {
		this.rightanswer = rightanswer;
	}
	public QuestionQuiz(Integer id, String category, String difficultlevel, String quesion, String option1,
			String option2, String option3, String option4, String rightanswer) {
		super();
		this.id = id;
		this.category = category;
		this.difficultlevel = difficultlevel;
		this.quesion = quesion;
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.option4 = option4;
		this.rightanswer = rightanswer;
	}
	@Override
	public String toString() {
		return "QuestionQuiz [id=" + id + ", category=" + category + ", difficultlevel=" + difficultlevel + ", quesion="
				+ quesion + ", option1=" + option1 + ", option2=" + option2 + ", option3=" + option3 + ", option4="
				+ option4 + ", rightanswer=" + rightanswer + "]";
	}
	public QuestionQuiz() {
		super();
	}
	
	
	
}
