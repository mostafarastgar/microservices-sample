package com.mostafa.springcould.testconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
//@EnableEurekaClient
public class TestconfigserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestconfigserverApplication.class, args);
	}

}
