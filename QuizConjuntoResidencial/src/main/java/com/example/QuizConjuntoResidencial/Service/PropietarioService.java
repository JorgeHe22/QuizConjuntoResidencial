package com.example.QuizConjuntoResidencial.Service;

import com.example.QuizConjuntoResidencial.Model.Propietario;
import com.example.QuizConjuntoResidencial.Model.Visitante;
import com.example.QuizConjuntoResidencial.Repository.PropietarioRepository;
import com.example.QuizConjuntoResidencial.Repository.VisitanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PropietarioService {

    @Autowired
    private PropietarioRepository propietarioRepository;

    public List<Propietario> findAll() {
        return propietarioRepository.findAll();
    }

    public Propietario save(Propietario propietario) {
        return propietarioRepository.save(propietario);
    }
    @Autowired
    private VisitanteRepository visitanteRepository;

    public List<Visitante> getVisitantesByPropietario(Long idPropietario) {
        return visitanteRepository.findByPropietarioId(idPropietario);
    }

}
