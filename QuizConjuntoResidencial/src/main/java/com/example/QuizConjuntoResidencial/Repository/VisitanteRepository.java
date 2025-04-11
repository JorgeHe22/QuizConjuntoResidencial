package com.example.QuizConjuntoResidencial.Repository;

import com.example.QuizConjuntoResidencial.Model.Visitante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VisitanteRepository extends JpaRepository<Visitante, Long> {
    @Query("SELECT v FROM Visitante v WHERE v.propietario.id = :idPropietario")
    List<Visitante> findByPropietarioId(@Param("idPropietario") Long idPropietario);

}
