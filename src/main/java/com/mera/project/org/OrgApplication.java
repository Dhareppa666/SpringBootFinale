package com.mera.project.org;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class OrgApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrgApplication.class, args);
	}

}
