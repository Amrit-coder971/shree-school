package com.example.demo;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;

@Service
public class UserService {

	private BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

	@Autowired
	private UserRepository userRepository;

	@PostConstruct
	private void createAdminUserIfNotExist() {
		System.out.println("inside createAdmin()");
		if (userRepository.count() == 0) {
			User admin = new User();
	        admin.setFirstName("Admin");
	        admin.setUsername("UserAdmin");
	        admin.setEmail("admin123@gmail.com");
	        admin.setPassword(passwordEncoder.encode("Admin@123"));
	        admin.setGender(Gender.MALE);
	        admin.setType(UserType.ADMIN);
	        userRepository.save(admin);
	        System.out.println("Created ADMIN user");
	    }
	}

}
