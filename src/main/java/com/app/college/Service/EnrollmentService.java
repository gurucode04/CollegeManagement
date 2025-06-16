package com.app.college.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.college.Entity.Enrollment;
import com.app.college.Repository.EnrollmentRepo;

@Service
public class EnrollmentService {
    @Autowired
    private EnrollmentRepo enrollmentRepo;

    public Enrollment createEnrollment(Enrollment enrollment){
        return enrollmentRepo.save(enrollment);
    }

    public Enrollment getEnrollment(Long id){
        return enrollmentRepo.findById(id).orElseThrow(() -> new RuntimeException("Enrollment not found"));
    }
    
    public List<Enrollment> getAllEnrollment(){
        return enrollmentRepo.findAll();   
    }

    public Enrollment updatedEnrollment(Long id, Enrollment updatedEnrollment){
        Enrollment existing = getEnrollment(id);
        existing.setEnrollmentDate(updatedEnrollment.getEnrollmentDate());
        existing.setGrade(updatedEnrollment.getGrade());
        return enrollmentRepo.save(existing);
    }

    public void deleteEnrollment(Long id){
        enrollmentRepo.deleteById(id);
    }
}
