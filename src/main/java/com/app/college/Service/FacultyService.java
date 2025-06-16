package com.app.college.Service;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.college.Entity.Faculty;
import com.app.college.Repository.FacultyRepo;

@Service
public class FacultyService {
    @Autowired
    private FacultyRepo facultyRepo;

    public Faculty createFaculty(Faculty faculty){
        return facultyRepo.save(faculty);
    }

    public Faculty getFaculty(Long id){
        return facultyRepo.findById(id).orElseThrow(() -> new RuntimeException("Faculty not found"));
    }

    public List<Faculty> getAllFaculties(){
        return facultyRepo.findAll();
    }

    public Faculty updateFaculty(Long id, Faculty updatedFaculty){
        Faculty existing = getFaculty(id);
        existing.setName(updatedFaculty.getName());
        existing.setEmail(updatedFaculty.getEmail());
        existing.setDesignation(updatedFaculty.getDesignation());
        return facultyRepo.save(existing);
    }

    public void deleteFaculty(Long id){
        facultyRepo.deleteById(id);
    }
    
}
