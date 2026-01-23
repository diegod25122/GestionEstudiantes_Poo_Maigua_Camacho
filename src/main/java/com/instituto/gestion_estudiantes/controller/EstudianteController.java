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
    @GetMapping("/{id}")
    public Estudiante obtenerPorId(@PathVariable Long id) {
        return service.obtenerPorId(id);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        service.eliminar(id);

    }
    @PutMapping("/{id}")
    public Estudiante actualizar(
            @PathVariable Long id,
            @Valid @RequestBody Estudiante estudiante) {
        return service.actualizar(id, estudiante);
    }



}
