package com.api.SoftU.repositories;

import com.api.SoftU.models.EstudianteModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEstudianteRepository extends JpaRepository<EstudianteModel, Integer> {
}
