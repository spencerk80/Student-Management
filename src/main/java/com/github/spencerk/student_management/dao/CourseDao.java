package com.github.spencerk.student_management.dao;

import com.github.spencerk.student_management.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseDao extends JpaRepository<Course, Integer> {
}
