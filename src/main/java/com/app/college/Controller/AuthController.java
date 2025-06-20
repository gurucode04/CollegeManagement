package com.app.college.Controller;

import com.app.college.DTO.LoginRequest; 
import com.app.college.DTO.SignupRequest; 
import com.app.college.DTO.JwtResponse; 
import com.app.college.Service.UserService; 
import com.app.college.Config.JwtUtils; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.http.ResponseEntity; 
import org.springframework.security.authentication.*; 
import org.springframework.security.core.userdetails.UserDetails; 
import org.springframework.web.bind.annotation.*; 
@RestController 
@RequestMapping("/api/auth") 
public class AuthController { 
@Autowired 
private UserService userService; 
@Autowired 
private AuthenticationManager authenticationManager; 
@Autowired 
private JwtUtils jwtUtils; 
@Autowired 
private com.app.college.Service.UserDetailsServiceImpl userDetailsService; 
@PostMapping("/signup") 
    public ResponseEntity<?> register(@RequestBody SignupRequest request) { 
        userService.register(request); 
        return ResponseEntity.ok("User registered successfully"); 
    } 
 
    @PostMapping("/login") 
    public ResponseEntity<?> login(@RequestBody LoginRequest request) { 
        authenticationManager.authenticate( 
                new UsernamePasswordAuthenticationToken(request.getUsername(), 
request.getPassword()) 
        ); 
 
        UserDetails userDetails = 
userDetailsService.loadUserByUsername(request.getUsername()); 
        String token = jwtUtils.generateToken(userDetails); 
 
        return ResponseEntity.ok(new JwtResponse(token)); 
    } 
}
