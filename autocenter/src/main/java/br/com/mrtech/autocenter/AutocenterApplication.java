package br.com.mrtech.autocenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@SpringBootApplication
public class AutocenterApplication {
	@GetMapping
	public String JavaHome(){
		return "<h1>Java Home,<br>Bem vindos a sua API de Locação de veiculos automotores</h1>";
	}

	public static void main(String[] args) {
		SpringApplication.run(AutocenterApplication.class, args);
	}

}
