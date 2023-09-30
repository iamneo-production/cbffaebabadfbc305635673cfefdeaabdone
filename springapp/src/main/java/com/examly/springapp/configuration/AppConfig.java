package com.examly.springapp.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.examly.springapp.model.Student;

@Configuration
@ComponentScan(basePackages = "com.examly.springapp")
public class AppConfig {

    // Define a bean for the Student class
    @Bean
    public Student student() {
        return new Student();
    }

    // You can define more beans and configurations as needed for your project

}
