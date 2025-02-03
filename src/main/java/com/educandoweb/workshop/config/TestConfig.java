package com.educandoweb.workshop.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.educandoweb.workshop.entities.User;
import com.educandoweb.workshop.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Ippo Makunouchi", "makunouchi@gmail.com", "123456789", "password");
		User u2 = new User(null, "Ichiro Miyata", "miyata@gmail.com", "987654321", "password");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
	}
}
