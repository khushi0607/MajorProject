package com.exam.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.model.Result;
import com.exam.model.User;
import com.exam.repo.ResultRepository;
import com.exam.service.ResultService;

@Service
public class ResultServiceImpl implements ResultService{

	@Autowired
	private ResultRepository resultRepository;
	
	@Override
	public Result addResult(Result result) {
		// TODO Auto-generated method stub
		return this.resultRepository.save(result);
	}
	
	@Override
	public List<Result> getResult(User uid) {
		// TODO Auto-generated method stub
		return this.resultRepository.findByUser(uid);
	}

	@Override
	public Result getSingleResult(Long rid) {
		// TODO Auto-generated method stub
		return this.resultRepository.findById(rid).get();
	}
}
