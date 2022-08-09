package com.github.spencerk.student_management.Controller;

import com.github.spencerk.student_management.model.Student;
import com.github.spencerk.student_management.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping("/students")
    public String addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }

    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/students/{studentID}")
    public Student getStudent(@PathVariable int studentID) {
        return studentService.getStudent(studentID);
    }

    @PutMapping("/students")
    public String updateStudent(@RequestBody Student student) {
        return studentService.updateStudent(student);
    }

    @DeleteMapping("/students/{studentID}")
    public String deleteStudent(@PathVariable int studentID) {
        return studentService.deleteStudent(studentID);
    }
}
