package com.app.college.Repository;


import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.college.Entity.Department;
import com.app.college.Entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Long>  {

    List<Student> findByDepartment(Department department);
    Page<Student> findAll(Pageable pageable);


}
