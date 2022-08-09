package com.github.spencerk.student_management.Controller;

import com.github.spencerk.student_management.model.Course;
import com.github.spencerk.student_management.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    CourseService courseService;

    @PostMapping("/courses")
    public String addStudent(@RequestBody Course course) {
        return courseService.addCourse(course);
    }

    @GetMapping("/courses")
    public List<Course> getAllCourses() {
        return courseService.getAllCourses();
    }

    @GetMapping("/courses/{courseID}")
    public Course getCourse(@PathVariable int courseID) {
        return courseService.getCourse(courseID);
    }

    @PutMapping("/courses")
    public String updateCourse(@RequestBody Course course) {
        return courseService.updateCourse(course);
    }

    @DeleteMapping("/courses/{courseID}")
    public String deleteCourse(@PathVariable int courseID) {
        return courseService.deleteCourse(courseID);
    }
}
