package com.example.QuizConjuntoResidencial.Service;

import com.example.QuizConjuntoResidencial.Model.reserva_parqueadero;
import com.example.QuizConjuntoResidencial.Repository.ReservaParqueaderoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservaParqueaderoService {

    @Autowired
    private ReservaParqueaderoRepository reservaParqueaderoRepository;

    public List<reserva_parqueadero> findAll() {
        return reservaParqueaderoRepository.findAll();
    }

    public reserva_parqueadero save(reserva_parqueadero reservaParqueadero) {
        return reservaParqueaderoRepository.save(reservaParqueadero);
    }
    public List<reserva_parqueadero> buscarPorPropietario(Long idPropietario) {
        return reservaParqueaderoRepository.findByPropietarioId(idPropietario);
    }

}
