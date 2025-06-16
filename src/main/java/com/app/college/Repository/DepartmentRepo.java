package com.app.college.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.app.college.Entity.Department;

@Repository
public interface DepartmentRepo extends JpaRepository<Department, Long> {

}
