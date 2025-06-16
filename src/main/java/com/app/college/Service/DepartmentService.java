package com.app.college.Service;

import java.util.*;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.college.Entity.Course;
import com.app.college.Entity.Department;
import com.app.college.Entity.Enrollment;
import com.app.college.Entity.Student;
import com.app.college.Repository.CourseRepo;
import com.app.college.Repository.DepartmentRepo;
import com.app.college.Repository.EnrollmentRepo;
import com.app.college.Repository.StudentRepo;

@Service
public class DepartmentService {
   @Autowired
    private DepartmentRepo departmentRepo;

    @Autowired
    private CourseRepo courseRepo;

    @Autowired
    private EnrollmentRepo enrollmentRepository;

    @Autowired
    private StudentRepo studentRepository;

    public Department createDepartment(Department department){
        return departmentRepo.save(department);
    }

    public Department getDepartment(Long id){
        return departmentRepo.findById(id).orElseThrow(() -> new RuntimeException("Department not found"));
    }

    public List<Department> getAllDepartments(){
        return departmentRepo.findAll();
    }
    
    public Department updateDepartment(Long id, Department updatedDepartment){
        Department existing = getDepartment(id);
        existing.setName(updatedDepartment.getName());
        existing.setHOD(updatedDepartment.getHOD());
        existing.setBuilding(updatedDepartment.getBuilding());
        return departmentRepo.save(existing);
    }

     @Transactional
    public void deleteDepartment(Long id) {
        Department department = departmentRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Department not found with id:"+ id));

        // Delete enrollments linked to students of this department
        List<Student> students = studentRepository.findByDepartment(department);
        for (Student student : students) {
            List<Enrollment> enrollments = enrollmentRepository.findByStudent(student);
            for (Enrollment enrollment : enrollments) {
                enrollmentRepository.delete(enrollment);
            }
        }

        // Optionally delete all students in the department
        for (Student student : students) {
            studentRepository.delete(student);
        }

        // Delete all courses in the department
        List<Course> courses = courseRepo.findByDepartment(department);
        for (Course course : courses) {
            courseRepo.delete(course);
        }

        // Delete the department itself
        departmentRepo.delete(department);
    }
}
