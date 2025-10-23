package com.ingesoft.tareas.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ingesoft.tareas.modelo.Tarea;
import com.ingesoft.tareas.repository.TareasRepository;

@RestController
@RequestMapping("/Tareas")
public class TareasController {
    @Autowired
    TareasRepository repository;

    public TareasController(TareasRepository tareasRepository) {
        this.repository = tareasRepository;
    } 

    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public Tarea crearTarea(@RequestBody Tarea todo) {
        return repository.save(todo);
    }

    @GetMapping("/")
    public Iterable<Tarea> getTareas() {
        return repository.findAll();
    }
}
