package com.softwarearchitecture.groupproject;

import com.softwarearchitecture.groupproject.entity.Role;
import com.softwarearchitecture.groupproject.entity.User;
import com.softwarearchitecture.groupproject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class GroupProjectApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(GroupProjectApplication.class, args);
	}

	public void run(String... args) {
		User adminAccount = userRepository.findByRole(Role.ADMIN);
		if(null ==  adminAccount) {
			User admin = new User();

			admin.setFirstName("admin");
			admin.setLastName("admin");
			admin.setEmail("admin@gmail.com");
			admin.setPhone("0123456789");
			admin.setPassword(new BCryptPasswordEncoder().encode("admin"));
			admin.setRole(Role.ADMIN);
			userRepository.save(admin);
		}
	}

}
