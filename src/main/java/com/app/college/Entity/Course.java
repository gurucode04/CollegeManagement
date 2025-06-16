package com.app.college.Entity;

import jakarta.persistence.*;
import java.util.*;

@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String courname;
    private int credits;
    

    @OneToMany(mappedBy = "course")
    private List<Enrollment> enrollments;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

    public Course(){

    }

    public Course(Long id, String cour_name, int credits) {
        this.id = id;
        this.courname = cour_name;
        this.credits = credits;
    }


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getCourname() {
        return courname;
    }


    public void setCourname(String courname) {
        this.courname = courname;
    }


    public int getCredits() {
        return credits;
    }


    public void setCredits(int credits) {
        this.credits = credits;
    }

    
}
