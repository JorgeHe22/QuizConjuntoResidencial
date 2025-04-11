package com.example.QuizConjuntoResidencial.Service;

import com.example.QuizConjuntoResidencial.Model.Reserva_zona;
import com.example.QuizConjuntoResidencial.Repository.ReservaZonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

@Service
public class ReservaZonaService {

    @Autowired
    private ReservaZonaRepository reservaZonaRepository;

    public List<Reserva_zona> findAll() {
        return reservaZonaRepository.findAll();
    }

    public Reserva_zona save(Reserva_zona reservaZona) {
        return reservaZonaRepository.save(reservaZona);
    }
    public List<Reserva_zona> buscarPorPropietario(Long idPropietario) {
        return reservaZonaRepository.findByPropietarioId(idPropietario);
    }
    public List<Reserva_zona> buscarPorFecha(LocalDate fecha) {
        return reservaZonaRepository.findByFecha(Date.valueOf(fecha));
    }
}
