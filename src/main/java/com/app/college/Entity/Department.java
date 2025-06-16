package com.app.college.Entity;

import jakarta.persistence.*;
import java.util.*;

@Entity
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String HOD;
    private String building;

    @OneToMany(mappedBy = "department")
    private List<Course> courses;

    public Department(){

    }

    public Department(Long id, String name, String hOD, String building) {
        this.id = id;
        this.name = name;
        this.HOD = hOD;
        this.building = building;
    }


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getHOD() {
        return HOD;
    }


    public void setHOD(String hOD) {
        this.HOD = hOD;
    }


    public String getBuilding() {
        return building;
    }


    public void setBuilding(String building) {
        this.building = building;
    }

    

    
}
