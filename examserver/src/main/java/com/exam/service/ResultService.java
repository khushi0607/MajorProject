package com.exam.service;

import org.springframework.stereotype.Service;
import java.util.List;
import com.exam.model.Result;
import com.exam.model.User;
import com.exam.model.exam.Quiz;


public interface ResultService {
	
	public Result addResult(Result result);

	public List<Result> getResult(User uid);
	
	public Result getSingleResult(Long rid);
	
}
