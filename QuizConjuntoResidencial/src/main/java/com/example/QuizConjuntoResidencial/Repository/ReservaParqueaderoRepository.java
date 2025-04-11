package com.example.QuizConjuntoResidencial.Repository;

import com.example.QuizConjuntoResidencial.Model.reserva_parqueadero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReservaParqueaderoRepository extends JpaRepository<reserva_parqueadero, Long> {
    @Query("SELECT r FROM reserva_parqueadero r WHERE r.propietario.id = :idPropietario")
    List<reserva_parqueadero> findByPropietarioId(@Param("idPropietario") Long idPropietario);

}
