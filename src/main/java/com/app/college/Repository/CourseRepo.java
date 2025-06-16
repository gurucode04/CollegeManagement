package com.app.college.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.app.college.Entity.Course;
import com.app.college.Entity.Department;

import java.util.List;

@Repository
public interface CourseRepo extends JpaRepository<Course, Long> {

    @Query("SELECT c FROM Course c WHERE c.department.id = :deptId")
    List<Course> findCoursesByDepartmentId(@Param("deptId") Long deptId);

    List<Course> findByDepartment(Department department);
}
