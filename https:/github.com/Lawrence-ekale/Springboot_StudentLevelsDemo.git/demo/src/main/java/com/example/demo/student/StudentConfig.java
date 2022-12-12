package com.example.demo.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

	@Bean
	CommandLineRunner commandLineRunner(
			StudentRepository repository) {
		return args-> {
			Student mariam = new Student(
					"Mariam",
					"mariam2@gmail.com",
					LocalDate.of(2000, 01, 5)
					);
			Student frida = new Student(
					"Frida",
					"frida2@gmail.com",
					LocalDate.of(2004, 01, 5)
					);
			
			repository.saveAll(
					List.of(mariam,frida)
					);
			
		};
	}
}
