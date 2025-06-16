package com.app.college.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.app.college.Entity.Enrollment;
import com.app.college.Service.EnrollmentService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/Enrollment") //Base URL
public class EnrollmentController {
    
    @Autowired
    private EnrollmentService enrollmentService;

    @PostMapping
    public ResponseEntity<Enrollment> create(@RequestBody Enrollment enrollment){
        return new ResponseEntity<>(enrollmentService.createEnrollment(enrollment), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Enrollment> get(@PathVariable Long id){
        return ResponseEntity.ok(enrollmentService.getEnrollment(id));
    }

    @GetMapping
    public List<Enrollment> getAll(){
        return enrollmentService.getAllEnrollment();
    }

    @PutMapping("/put/{id}")
    public ResponseEntity<Enrollment> update(@PathVariable Long id, @RequestBody Enrollment enrollment){
        return ResponseEntity.ok(enrollmentService.updatedEnrollment(id, enrollment));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        enrollmentService.deleteEnrollment(id);
        return ResponseEntity.noContent().build();
    }
    
    
    
}
