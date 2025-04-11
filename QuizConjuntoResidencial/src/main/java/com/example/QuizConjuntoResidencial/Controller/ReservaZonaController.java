package com.example.QuizConjuntoResidencial.Controller;

import com.example.QuizConjuntoResidencial.Model.Reserva_zona;
import com.example.QuizConjuntoResidencial.Service.ReservaZonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDate;

import java.sql.Date;
import java.util.List;

@RestController
@RequestMapping("/api/reservas-zona")
public class ReservaZonaController {

    @Autowired
    private ReservaZonaService reservaZonaService;

    @GetMapping
    public List<Reserva_zona> getAll() {
        return reservaZonaService.findAll();
    }

    @PostMapping
    public Reserva_zona save(@RequestBody Reserva_zona reservaZona) {
        return reservaZonaService.save(reservaZona);
    }
    @GetMapping("/por-propietario/{id}")
    public List<Reserva_zona> obtenerPorPropietario(@PathVariable Long id) {
        return reservaZonaService.buscarPorPropietario(id);
    }
    @GetMapping("/por-fecha")
    public List<Reserva_zona> obtenerPorFecha(@RequestParam("fecha") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate fecha) {
        return reservaZonaService.buscarPorFecha(fecha);
    }
}
