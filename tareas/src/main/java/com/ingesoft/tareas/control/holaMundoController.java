package com.ingesoft.tareas.control;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class holaMundoController {
    @GetMapping("/")
    public String holaMundo() {
        return "Hola Mundo desde Spring Boot";
    }
}
