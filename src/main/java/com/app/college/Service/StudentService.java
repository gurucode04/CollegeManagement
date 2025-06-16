package com.app.college.Service;

import java.util.*;

import javax.management.relation.RelationNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.college.Entity.Enrollment;
import com.app.college.Entity.Student;
import com.app.college.Repository.EnrollmentRepo;
import com.app.college.Repository.StudentRepo;

@Service
public class StudentService {
    @Autowired
    private StudentRepo studentRepo;

    @Autowired
    private EnrollmentRepo enrollmentRepo;

    public Student createStudent(Student student){
        return studentRepo.save(student);
    }

    public Student getStudent(Long id){
        return studentRepo.findById(id).orElseThrow(() -> new RuntimeException("Student not fount"));
    }

    public List<Student> getAllStudents(){
        return studentRepo.findAll();
    }

    public Student updateStudent(Long id, Student updatedStudent){
        Student existing = getStudent(id);
        existing.setName(updatedStudent.getName());
        existing.setEmail(updatedStudent.getEmail());
        existing.setPhone(updatedStudent.getPhone());
        return studentRepo.save(existing);
    }

    @Transactional
    public void deleteStudent(Long id) throws RelationNotFoundException {
        Student student = studentRepo.findById(id)
                .orElseThrow(() -> new RelationNotFoundException("Student not found with id: " + id));

        // Delete enrollments linked to student
        List<Enrollment> enrollments = enrollmentRepo.findByStudent(student);
        for (Enrollment enrollment : enrollments) {
            enrollmentRepo.delete(enrollment);
        }

        // Delete the student
        studentRepo.delete(student);
    }

    
}
