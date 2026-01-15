package com.instituto.gestion_estudiantes.controller;

import com.instituto.gestion_estudiantes.model.Estudiante;
import com.instituto.gestion_estudiantes.service.EstudianteService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/estudiantes")
public class EstudianteController {

    private final EstudianteService service;

    public EstudianteController(EstudianteService service) {
        this.service = service;
    }

    @GetMapping
    public List<Estudiante> listar() {
        return service.listarTodos();
    }

    @PostMapping
    public Estudiante crear(@Valid @RequestBody Estudiante estudiante) {
        return service.guardar(estudiante);
    }
}
