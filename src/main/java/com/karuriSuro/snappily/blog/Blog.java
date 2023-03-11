/**
 * 
 */
package com.karuriSuro.snappily.blog;

import java.time.LocalDateTime;

/**
 * @author surajitkaruri
 *
 */
public record Blog(
		Long id, 
		String title, 
		String textContent, 
		LocalDateTime createdOn, 
		Integer likes) {

}
