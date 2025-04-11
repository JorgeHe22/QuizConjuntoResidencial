package com.example.QuizConjuntoResidencial.Controller;

import com.example.QuizConjuntoResidencial.Model.Visitante;
import com.example.QuizConjuntoResidencial.Service.VisitanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/visitantes")
public class VisitanteController {

    @Autowired
    private VisitanteService visitanteService;

    @GetMapping
    public List<Visitante> getAll() {
        return visitanteService.findAll();
    }

    @PostMapping
    public Visitante save(@RequestBody Visitante visitante) {
        return visitanteService.save(visitante);
    }
    @GetMapping("/por-propietario/{id}")
    public List<Visitante> obtenerPorPropietario(@PathVariable Long id) {
        return visitanteService.buscarPorPropietario(id);
    }
}
