/**
 * 
 */
package com.karuriSuro.snappily.blog;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author surajitkaruri
 *
 */

@Service
public class BlogService {
	private Logger logger = LoggerFactory.getLogger(BlogService.class);
	
	@Autowired
	private BlogRepository blogRepository;

	public Blog findBlog(Integer blogId) 
	{
		List<Blog> blogList = Arrays.asList(new Blog(11L, "Feelings", "Feeling high today!!", LocalDateTime.now(), 0));
		Blog blogFound = blogList
				.stream()
				.filter(b -> b.id().equals(blogId))
				.findFirst()
				.orElseThrow();
		logger.trace(blogFound.toString());
		logger.trace(blogFound.title());
		
		return blogFound;
	}
	
	public List<Blog> findAllBlogs(){
		return blogRepository.findAll()
				.stream()
				.map(e -> new Blog(e.getId(), e.getTitle(), e.getTextContent(), e.getCreatedOn(), e.getLikes()))
				.toList();
	}

}
