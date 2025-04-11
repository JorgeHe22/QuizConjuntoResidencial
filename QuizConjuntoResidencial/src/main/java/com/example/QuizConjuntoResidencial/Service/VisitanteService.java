package com.example.QuizConjuntoResidencial.Service;

import com.example.QuizConjuntoResidencial.Model.Visitante;
import com.example.QuizConjuntoResidencial.Repository.VisitanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VisitanteService {

    @Autowired
    private VisitanteRepository visitanteRepository;

    public Visitante save(Visitante visitante) {
        return visitanteRepository.save(visitante);
    }

    public List<Visitante> buscarPorPropietario(Long idPropietario) {
        return visitanteRepository.findByPropietarioId(idPropietario);
    }

    public List<Visitante> getVisitantesByPropietario(Long idPropietario) {
        return visitanteRepository.findByPropietarioId(idPropietario);
    }
    public List<Visitante> findAll() {
        return visitanteRepository.findAll();
    }
}

