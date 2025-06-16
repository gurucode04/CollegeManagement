package com.app.college.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity 
@Data
@Table(name = "users") 
public class User { 
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Long id; 
 
    @Column(unique = true, nullable = false) 
    private String username; 
 
    @Column(nullable = false) 
    private String name; 
 
    @Column(nullable = false) 
    private String password; 
 
    @Column(nullable = false) 
    private String email; 
 
    @Column(nullable = false) 
    private String phone; 
 
    private String role = "ROLE_USER";

    public User orElseThrow(Object object) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'orElseThrow'");
    } 
 
    // Getters and Setters 
}
