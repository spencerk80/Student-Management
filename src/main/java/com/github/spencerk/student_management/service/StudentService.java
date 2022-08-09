package com.github.spencerk.student_management.service;

import com.github.spencerk.student_management.dao.StudentDao;
import com.github.spencerk.student_management.model.Student;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class StudentService {
    @Autowired
    StudentDao  studentDao;

    public String addStudent(Student student) {
        studentDao.save(student);
        return "Student added";
    }

    public Student getStudent(int id) {
        Optional<Student> optional = studentDao.findById(id);
        if(optional.isPresent()) return optional.get();
        return null;
    }

    public List<Student> getAllStudents() {
        return studentDao.findAll();
    }

    public String updateStudent(Student student) {
        studentDao.save(student);
        return "Student updated";
    }

    public String deleteStudent(int id) {
        studentDao.deleteById(id);
        return "Student deleted";
    }
}
