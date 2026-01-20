package com.instituto.gestion_estudiantes.service;

import com.instituto.gestion_estudiantes.model.Estudiante;
import com.instituto.gestion_estudiantes.repository.EstudianteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteService {

    private final EstudianteRepository repository;

    public EstudianteService(EstudianteRepository repository) {
        this.repository = repository;
    }

    public List<Estudiante> listarTodos() {
        return repository.findAll();
    }

    public Estudiante guardar(Estudiante estudiante) {
        return repository.save(estudiante);
    }

    public Estudiante obtenerPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Estudiante no encontrado"));
    }

    public void eliminar(Long id) {
        repository.deleteById(id);
    }

    public Estudiante actualizar(Long id, Estudiante estudiante) {
        Estudiante existente = obtenerPorId(id);

        existente.setNombre(estudiante.getNombre());
        existente.setEmail(estudiante.getEmail());
        existente.setEdad(estudiante.getEdad());
        existente.setCarrera(estudiante.getCarrera());

        return repository.save(existente);
    }

}
