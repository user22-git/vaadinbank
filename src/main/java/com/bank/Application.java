package com.bank;

import com.bank.domain.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import java.io.FileReader;
import java.io.FileWriter;

/**
 * The entry point of the Spring Boot application.
 */
@SpringBootApplication(exclude = ErrorMvcAutoConfiguration.class)
public class Application extends SpringBootServletInitializer {
    public static void main(String[] args) throws Exception {
        Creator creator = new Creator();
        creator.createBank();
        SpringApplication.run(Application.class, args);
    }

}
