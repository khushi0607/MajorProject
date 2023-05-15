package com.exam.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.exam.model.exam.Quiz;

@Entity
@Table(name = "result")
public class Result {

	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)   
	 private Long rid;
	 
	 
	 private double marksObtained;
	 private int quesAttempted;
	 private int correctAnswers;
	 
	 
	 
	 @ManyToOne(fetch = FetchType.EAGER)
	    private Quiz quiz;
	 
	 @ManyToOne(fetch = FetchType.EAGER)
	    private User user;
	 
	public Result(double marksGot, int attempted, int correctAnswers2) {
		super();
		this.marksObtained = marksGot;
		this.quesAttempted = attempted;
		this.correctAnswers = correctAnswers2;
	}


	public Result() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Long getRid() {
		return rid;
	}


	public void setRid(Long rid) {
		this.rid = rid;
	}


	public double getMarksObtained() {
		return marksObtained;
	}


	public void setMarksObtained(double marksObtained) {
		this.marksObtained = marksObtained;
	}


	public int getQuesAttempted() {
		return quesAttempted;
	}


	public void setQuesAttempted(int quesAttempted) {
		this.quesAttempted = quesAttempted;
	}


	public int getCorrectAnswers() {
		return correctAnswers;
	}


	public void setCorrectAnswers(int correctAnswers) {
		this.correctAnswers = correctAnswers;
	}


	public Quiz getQuiz() {
		return quiz;
	}


	public void setQuiz(Quiz quiz) {
		this.quiz = quiz;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}

	
	
	
	
}
