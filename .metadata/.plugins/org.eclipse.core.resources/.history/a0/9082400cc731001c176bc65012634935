package com.springboot.app.api.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.app.api.model.Post;
import com.springboot.app.api.service.PostService;

@RestController
@RequestMapping("/api/post")
public class PostController {
	private PostService postService;

	public PostController(PostService postService) {
		super();
		this.postService = postService;
	}
	
	/*
	 * Get Data from posts Table
	 * METHOD : GET
	 * URL    : http://localhost:8080/api/post
	 */
	@GetMapping
	public List<Post> getPost(){
		return postService.getPost();
	}
	
	/*
	 * Insert Data Into Employee Table
	 * METHOD : POST
	 * URL    : http://localhost:8080/api/post
	 */
	
	@PostMapping()
	public ResponseEntity<Post> savePost(@RequestBody Post post) {
		return new ResponseEntity<Post>(postService.savePost(post), HttpStatus.CREATED);
	}
	
	
	
}
