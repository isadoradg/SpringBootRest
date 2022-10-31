package Funtec.meuprimeiroapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BemVindoController {

	@GetMapping
	public String bemVindo() {
		return "Bem vindo ao meu primeiro Spring Boot Web API";
	}
	
}
