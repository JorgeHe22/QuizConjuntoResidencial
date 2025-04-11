package com.example.QuizConjuntoResidencial.Service;

import com.example.QuizConjuntoResidencial.Model.zona_social;
import com.example.QuizConjuntoResidencial.Repository.ZonaSocialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ZonaSocialService {

    @Autowired
    private ZonaSocialRepository zonaSocialRepository;

    public List<zona_social> findAll() {
        return zonaSocialRepository.findAll();
    }

    public zona_social save(zona_social zonaSocial) {
        return zonaSocialRepository.save(zonaSocial);
    }
}
