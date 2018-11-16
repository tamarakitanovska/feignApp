package com.example.rest_exercise;

import com.example.rest_exercise.model.Student;
import com.example.rest_exercise.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.xml.ws.Action;

@SpringBootApplication
public class RestExerciseApplication implements CommandLineRunner {
	@Autowired
	private StudentRepository studentRepository;

	public static void main(String[] args) {
		SpringApplication.run(RestExerciseApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		studentRepository.save(new Student("Tamara", "123"));
		studentRepository.save(new Student("Nikola", "123"));
		studentRepository.save(new Student("Ilija", "123"));
	}
}
