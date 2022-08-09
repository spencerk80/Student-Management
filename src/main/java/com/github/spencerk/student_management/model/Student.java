package com.github.spencerk.student_management.model;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int             id;
    private String          fname,
                            lname,
                            email,
                            phone;
    @ManyToMany
    private List<Course>    courses;

    public Student() {}

    public Student(String fname, String lname, String email, String phone, List<Course> courses) {
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.phone = phone;
        this.courses = courses;
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    @Override
    public boolean equals(Object o) {
        Student student;

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        student = (Student) o;

        return id == student.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        StringBuilder courseSB = new StringBuilder("Courses[");

        courses.forEach(course -> courseSB.append(String.format("\n\t\n\t%s", course)));
        courseSB.append("\n\t]");

        return String.format(
                "Student{\n\tid=%d,\n\tfirstname=%s,\n\tlastname=%s,\n\temail=%s,\n\tphone=%s,\n\tcourses=%s}",
                id, fname, lname, email, phone, courseSB.toString()
        );
    }
}
