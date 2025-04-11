package com.example.QuizConjuntoResidencial.Repository;

import com.example.QuizConjuntoResidencial.Model.Reserva_zona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

@Repository
public interface ReservaZonaRepository extends JpaRepository<Reserva_zona, Long> {

    @Query("SELECT r FROM Reserva_zona r WHERE r.propietario.id = :idPropietario")
    List<Reserva_zona> findByPropietarioId(@Param("idPropietario") Long idPropietario);
    @Query("SELECT r FROM Reserva_zona r WHERE r.fecha = :fecha")
    List<Reserva_zona> findByFecha(@Param("fecha") Date fecha);
}


