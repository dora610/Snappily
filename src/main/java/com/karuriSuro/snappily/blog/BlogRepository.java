/**
 * 
 */
package com.karuriSuro.snappily.blog;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

/**
 * @author surajitkaruri
 *
 */
public interface BlogRepository extends CrudRepository<BlogEntity, Long> {
	List<BlogEntity> findAll();
}
