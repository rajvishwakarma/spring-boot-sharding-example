package com.sample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages = { "com.sample.*" })
@ComponentScan(basePackages = { "com.sample.*" })
@EnableJpaRepositories(basePackages = { "com.sample.*" })
@SpringBootApplication
public class SpringBootShardApplication {
	
	private final Logger logger = LoggerFactory.getLogger(SpringBootShardApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootShardApplication.class, args);
	}
	
}
