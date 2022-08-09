package com.github.spencerk.student_management.service;

import com.github.spencerk.student_management.dao.CourseDao;
import com.github.spencerk.student_management.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {
    @Autowired
    CourseDao courseDao;

    public String addCourse(Course course) {
        courseDao.save(course);
        return "Course saved";
    }

    public List<Course> getAllCourses() {
        return courseDao.findAll();
    }

    public Course getCourse(int id) {
        Optional<Course> optional = courseDao.findById(id);

        if(optional.isPresent()) return optional.get();
        return null;
    }

    public String updateCourse(Course course) {
        courseDao.save(course);
        return "Course updated";
    }

    public String deleteCourse(int id) {
        courseDao.deleteById(id);
        return "Course deleted";
    }
}
