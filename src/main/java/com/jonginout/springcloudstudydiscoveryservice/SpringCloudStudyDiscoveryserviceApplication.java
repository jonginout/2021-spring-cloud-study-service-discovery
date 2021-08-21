package com.jonginout.springcloudstudydiscoveryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import java.util.ArrayList;

@SpringBootApplication
@EnableEurekaServer
public class SpringCloudStudyDiscoveryserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudStudyDiscoveryserviceApplication.class, args);
	}

}
