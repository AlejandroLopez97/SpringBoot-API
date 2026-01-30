package com.api.SoftU.repositories;

import com.api.SoftU.models.ProfesorModel;
import jakarta.persistence.Table;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProfesorRepository extends JpaRepository<ProfesorModel, Integer> {
}
