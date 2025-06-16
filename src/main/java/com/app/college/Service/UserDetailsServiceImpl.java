package com.app.college.Service;

import com.app.college.Entity.User; 
import com.app.college.Repository.UserRepo; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.security.core.userdetails.*; 
import org.springframework.stereotype.Service; 
 
import java.util.Collections;
@Service 
public class UserDetailsServiceImpl implements UserDetailsService { 
 
    @Autowired 
    private UserRepo userRepository; 
 
    @Override 
    public UserDetails loadUserByUsername(String username) throws 
UsernameNotFoundException { 
        User user = userRepository.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException("User not found with username: " + username));
 
        return new org.springframework.security.core.userdetails.User( 
                user.getUsername(), 
                user.getPassword(), 
                Collections.emptyList() 
        ); 
    } 
}
