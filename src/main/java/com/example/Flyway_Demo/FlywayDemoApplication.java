package com.example.Flyway_Demo;

import com.example.Flyway_Demo.dto.UserDto;
import com.example.Flyway_Demo.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.liquibase.LiquibaseProperties;

@SpringBootApplication
public class FlywayDemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(FlywayDemoApplication.class, args);

	}

}
