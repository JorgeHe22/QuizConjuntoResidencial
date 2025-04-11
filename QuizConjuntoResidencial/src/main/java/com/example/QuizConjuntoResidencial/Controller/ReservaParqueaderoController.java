package com.example.QuizConjuntoResidencial.Controller;


import com.example.QuizConjuntoResidencial.Model.reserva_parqueadero;
import com.example.QuizConjuntoResidencial.Service.ReservaParqueaderoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reservas-parqueadero")
public class ReservaParqueaderoController {

    @Autowired
    private ReservaParqueaderoService reservaParqueaderoService;

    @GetMapping
    public List<reserva_parqueadero> getAll() {
        return reservaParqueaderoService.findAll();
    }

    @PostMapping
    public reserva_parqueadero save(@RequestBody reserva_parqueadero reservaParqueadero) {
        return reservaParqueaderoService.save(reservaParqueadero);
    }
    @GetMapping("/por-propietario/{id}")
    public List<reserva_parqueadero> obtenerPorPropietario(@PathVariable Long id) {
        return reservaParqueaderoService.buscarPorPropietario(id);
    }

}
