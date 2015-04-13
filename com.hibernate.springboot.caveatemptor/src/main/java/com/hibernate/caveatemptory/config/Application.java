package com.hibernate.caveatemptory.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;

@Configuration
@PropertySource("file:/my_etc/com.hibernate.caveatemptor/application.properties")
@Import(RepositoryRestMvcConfiguration.class)
@EnableJpaRepositories("com.hibernate.caveatemptor.repositories")
@EnableAutoConfiguration
@EntityScan("com.hibernate.caveatemptor.examples")
@ComponentScan
public class Application extends SpringBootServletInitializer {
	
	@Override
	public SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Application.class); 
	}
	
	public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
