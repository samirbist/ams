package com.ams.security.config;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.ams.db.entity.User;
import com.ams.repository.UserRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService {

	private static final Logger LOG = LoggerFactory.getLogger(SecurityConfiguration.class);
    @Autowired
    private UserRepository usersRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    	LOG.debug("Find user by log name : {}", username);
        Optional<User> optionalUsers = usersRepository.findByLoginName(username);
        LOG.debug("User by username : {} is  {}",username, optionalUsers.get());
        optionalUsers
                .orElseThrow(() -> new UsernameNotFoundException("Username not found"));
        User user = optionalUsers.get();
        
        CustomUserDetails customUserDetails = new CustomUserDetails(user);
        return customUserDetails;
    }
}
