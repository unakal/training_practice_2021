package com.example.demo;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.Donar;
import com.example.demo.repository.DonarRepository;

@SpringBootApplication
public class DonarApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DonarApplication.class, args);
	}
	
	@Autowired
	public DonarRepository donarRepository;
	

	@Override
	public void run(String... args) throws Exception {
//		Donar donar=new Donar(111, "naveen", "male", 23, LocalDate.of(1999, 7, 23), "A+", LocalDate.of(2015, 8, 15), "naveen@gmail.com", "7019259465", "karnatak", "dharwad");
//		donarRepository.save(donar);
//		Donar donar1=new Donar(121, "praven", "male", 23, LocalDate.of(1999, 7, 23), "A+", LocalDate.of(2015, 8, 15), "pavya@gmail.com", "7019259465", "karnatak", "dharwad");
//		donarRepository.save(donar1);
	}

}
