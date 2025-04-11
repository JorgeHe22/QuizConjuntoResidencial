package com.example.QuizConjuntoResidencial.Repository;

import com.example.QuizConjuntoResidencial.Model.Propietario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PropietarioRepository extends JpaRepository<Propietario, Long> {
}