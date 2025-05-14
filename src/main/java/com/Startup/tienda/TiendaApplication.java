package com.Startup.tienda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {
    "com.Controllers",
    "com.DTOS",
    "com.Entities",
    "com.Repositories.Repositories",
	"com.Repositories.RepositoriesImpl",
	"com.Services.Services",
	"com.Services.ServicesImpl"
})
public class TiendaApplication {

	public static void main(String[] args) {
		SpringApplication.run(TiendaApplication.class, args);
	}

}