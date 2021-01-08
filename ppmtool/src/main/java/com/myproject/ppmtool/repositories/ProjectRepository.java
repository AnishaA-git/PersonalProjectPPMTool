package com.myproject.ppmtool.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.myproject.ppmtool.domain.Project;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Long>{
	
	@Override
	default Iterable<Project> findAllById(Iterable<Long> arg0) {
		return null;
	}
	
}
