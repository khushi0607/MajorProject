package com.exam.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exam.model.Result;
import com.exam.model.User;
import com.exam.model.exam.Quiz;

public interface ResultRepository extends JpaRepository<Result, Long> {
	public List<Result> findByUser(User user);

}
