package com.manime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


import java.io.IOException;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.manime.repository")
@EntityScan(basePackages = "com.manime.model")
public class ManimeApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(ManimeApplication.class, args);
    }

}
