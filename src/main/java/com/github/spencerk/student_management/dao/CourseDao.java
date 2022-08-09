package com.github.spencerk.student_management.dao;

import com.github.spencerk.student_management.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseDao extends JpaRepository<Course, Integer> {
}
