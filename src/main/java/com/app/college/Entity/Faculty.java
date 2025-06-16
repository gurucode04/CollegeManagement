package com.app.college.Entity;

import jakarta.persistence.*;
//import java.util.*;


@Entity
public class Faculty {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String designation;

    /*@OneToMany
    @JoinColumn(name = "id")
    private List<Department>Department;*/

    public Faculty(){
        
    }

    public Faculty(Long id, String name, String email, String designation) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.designation = designation;
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


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public String getDesignation() {
        return designation;
    }


    public void setDesignation(String designation) {
        this.designation = designation;
    }    
}