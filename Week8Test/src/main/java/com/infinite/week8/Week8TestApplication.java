package com.infinite.week8;
//Starter class with Swagger enabled
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
@EnableSwagger2
public class Week8TestApplication {

	public static void main(String[] args) {
		SpringApplication.run(Week8TestApplication.class, args);
	}

}
