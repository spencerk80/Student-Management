package com.github.spencerk.student_management.dao;

import com.github.spencerk.student_management.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentDao extends JpaRepository<Student, Integer> {
}
