package com.karuriSuro.snappily.blog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogController {
	
	private final BlogService blogService;
	
	@Autowired
	public BlogController(BlogService blogService) {
		this.blogService = blogService;
	}


	@GetMapping("/blog")
	public Blog getBlog(
			@RequestParam(name = "id", required = true) Integer id) 
	{
		return blogService.findBlog(id);
	}
}
