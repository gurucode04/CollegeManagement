package com.app.college.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.app.college.Entity.Faculty;
@Repository
public interface FacultyRepo extends JpaRepository<Faculty, Long> {
    
}
