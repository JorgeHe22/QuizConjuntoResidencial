package com.example.QuizConjuntoResidencial.Controller;

import com.example.QuizConjuntoResidencial.Model.Propietario;
import com.example.QuizConjuntoResidencial.Model.Visitante;
import com.example.QuizConjuntoResidencial.Service.PropietarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/propietarios")
public class PropietarioController {

    @Autowired
    private PropietarioService propietarioService;

    @GetMapping
    public List<Propietario> getAll() {
        return propietarioService.findAll();
    }

    @PostMapping
    public Propietario save(@RequestBody Propietario propietario) {
        return propietarioService.save(propietario);
    }
    @GetMapping("/{id}/visitantes")
    public List<Visitante> getVisitantesPorPropietario(@PathVariable Long id) {
        return propietarioService.getVisitantesByPropietario(id);
    }


}
