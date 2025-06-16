package com.app.college.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.college.Entity.Course;
import com.app.college.Service.CourseService;

@RestController
@RequestMapping("/api/courses") //Base URL
public class CourseController {

    @Autowired
    private CourseService courseService;

    @PostMapping
    public ResponseEntity<Course> create(@RequestBody Course course){
        return new ResponseEntity<>(courseService.createCourse(course), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Course> get(@PathVariable Long id){
        return ResponseEntity.ok(courseService.getCourse(id));
    }

    @GetMapping
    public List<Course> getAll(){
        return courseService.getAllCourses();
    }

    @PutMapping("/put/{id}")
    public ResponseEntity<Course> update(@PathVariable Long id, @RequestBody Course course){
        return ResponseEntity.ok(courseService.updateCourse(id, course));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        courseService.deleteCourse(id);
        return ResponseEntity.noContent().build();
    }
    
}
