package com.exam.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exam.model.Result;
import com.exam.model.User;
import com.exam.model.exam.Question;
import com.exam.model.exam.Quiz;
import com.exam.service.QuestionService;
import com.exam.service.ResultService;

@RestController
@CrossOrigin("*")
@RequestMapping("/re")
public class ResultController {

	@Autowired
	private ResultService resultService;

	
	@PostMapping("/result")
    public ResponseEntity<Result> add(@RequestBody Result result) {
        return ResponseEntity.ok(this.resultService.addResult(result));
    }
	
	
	@GetMapping("/{uid}")
	public List<Result> getResultbyUser(@PathVariable("uid") Long uid) {
	    User user = new User();
	    user.setId(uid);
	    return this.resultService.getResult(user);
	}
	
	
	 //get single result 
    @GetMapping("r/{rid}")
    public Result getResult(@PathVariable("rid") Long rid) {
        return this.resultService.getSingleResult(rid);
    }
		
}
