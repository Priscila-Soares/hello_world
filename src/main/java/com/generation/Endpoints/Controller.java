package com.generation.Endpoints;

import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }

    @GetMapping("/bsms")
    public List<String> bsms() {
        return Arrays.asList("Mentalidade de crescimento", "Orientação para o futuro",
                "Responsabilidade pessoal", "Comunicação eficaz", "Trabalho em equipe", "Mentalidade proativa");
    }

    @GetMapping("/objetivos")
    public List<String> objetivos() {
        return Arrays.asList("MySQL", "Currículo", "Spring Boot",
                "Spring Framework", "Spring Data JPA", "Rest API com Spring Boot");
    }
}

	
	


