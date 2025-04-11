package com.example.QuizConjuntoResidencial.Repository;

import com.example.QuizConjuntoResidencial.Model.zona_social;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZonaSocialRepository extends JpaRepository<zona_social, Long> {
}
