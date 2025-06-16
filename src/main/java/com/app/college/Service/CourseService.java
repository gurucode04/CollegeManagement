package com.app.college.Service;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.college.Entity.Course;
import com.app.college.Repository.CourseRepo;

@Service
public class CourseService {
    @Autowired
    private CourseRepo courseRepo;

    public Course createCourse(Course course){
        return courseRepo.save(course);
    }

    public Course getCourse(Long id){
        return courseRepo.findById(id).orElseThrow(() -> new RuntimeException("Course not found"));
    }

    public List<Course> getAllCourses(){
        return courseRepo.findAll();
    }

    public Course updateCourse(Long id, Course updatedCourse){
        Course existing = getCourse(id);
        existing.setCourname(updatedCourse.getCourname());
        existing.setCredits(updatedCourse.getCredits());
        return courseRepo.save(existing);
    }
    
    public void deleteCourse(Long id){
        courseRepo.deleteById(id);
    }
}
