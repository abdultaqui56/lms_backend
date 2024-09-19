package com.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import java.util.List;
import com.application.model.Chapter;

public interface ChapterRepository extends JpaRepository<Chapter, Integer>
{
	public List<Chapter> findByCoursename(String Coursename);
	
}