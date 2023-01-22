package com.manime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.thymeleaf.spring6.view.ThymeleafViewResolver;

import java.io.IOException;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.manime.repository")
@EntityScan(basePackages = "com.manime.model")
public class ManimeApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(ManimeApplication.class, args);
    }

    @Bean
    public InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/templates/");
        viewResolver.setSuffix(".html");
        return viewResolver;
    }

}