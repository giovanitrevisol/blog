package br.com.gt.msplsblog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MsPlsBlogApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsPlsBlogApplication.class, args);
		System.out.println("--------------->>>");
		System.out.println("MS-PLS-BLOG");
	}

	//acesso swagger
	//http://localhost:8080/swagger-ui.html

}
