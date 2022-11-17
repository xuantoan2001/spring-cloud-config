package com.xtoan.springcloudconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableConfigServer

public class SpringCloudConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigApplication.class, args);
	}

}
