package com.noor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringBootPRoj01EurekaServerApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringBootPRoj01EurekaServerApplication.class, args);
	}

}
