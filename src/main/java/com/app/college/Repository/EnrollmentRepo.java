package com.app.college.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.*;

import com.app.college.Entity.Course;
import com.app.college.Entity.Enrollment;
import com.app.college.Entity.Student;

@Repository
public interface EnrollmentRepo extends JpaRepository<Enrollment, Long> {

    @Query("SELECT e.course FROM Enrollment e WHERE e.student.id = :studentId")
    List<Course> findCoursesByStudentId(@Param("studentId") Long studentId);

    List<Enrollment> findByStudent(Student student);

    
}
