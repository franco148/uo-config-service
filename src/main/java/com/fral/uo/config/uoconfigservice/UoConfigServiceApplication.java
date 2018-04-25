package com.fral.uo.config.uoconfigservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class UoConfigServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UoConfigServiceApplication.class, args);
	}
}
