package com.projeto2.workshopmongodb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class WorkshopmongodbApplication {

	public static void main(String[] args) {
		SpringApplication.run(WorkshopmongodbApplication.class, args);
	}

}
