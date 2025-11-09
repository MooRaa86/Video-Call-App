package com.Omar.VideoCall;

import com.Omar.VideoCall.Users.User;
import com.Omar.VideoCall.Users.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class VideoCallApplication {

	public static void main(String[] args) {
		SpringApplication.run(VideoCallApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(UserService userService) {
		return args -> {
			userService.registerUser(User.builder()
					.username("Omar Medhat")
					.email("mr.omarmedhat@gmail.com")
					.password("34870371")
					.build());

			userService.registerUser(User.builder()
					.username("Hazem Saeed")
					.email("hazemsaed512@gmail.com")
					.password("123456789")
					.build());

			userService.registerUser(User.builder()
					.username("Rahma Ismaiel")
					.email("Rahma742@gmail.com")
					.password("987654321")
					.build());
		};

	}

}
