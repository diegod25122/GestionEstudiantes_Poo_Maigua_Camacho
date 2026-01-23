package com.instituto.gestion_estudiantes.repository;

import com.instituto.gestion_estudiantes.model.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudianteRepository extends JpaRepository<Estudiante, Long> {
}
