package com.example.demo.model;

import com.example.demo.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {
            studentRepository.saveAll(
                    List.of(
                            new Student("Alex", "Schmidt", "alex.schmidt@gmail.uk", 23),
                            new Student("Mariam", "Jones", "mariam.jones@gmail.uk", 22)
                    )
            );
        };
    }
}
