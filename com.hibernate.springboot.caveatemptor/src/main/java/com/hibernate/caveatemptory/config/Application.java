package com.hibernate.caveatemptory.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;

@SpringBootApplication
@PropertySource("file:/my_etc/com.hibernate.caveatemptor/application.properties")
@Import(RepositoryRestMvcConfiguration.class)
public class Application {

	
	
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
