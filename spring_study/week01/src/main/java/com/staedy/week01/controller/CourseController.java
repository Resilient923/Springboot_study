package com.staedy.week01.controller;


import com.staedy.week01.practice.Course;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

    @GetMapping("/courses")
    public Course getCourses() {
        Course course = new Course();
        course.setTitle("TestClass");
        course.setDays(10);
        course.setTutor("steady");
        return course;
    }
}
