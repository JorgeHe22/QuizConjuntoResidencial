package com.example.QuizConjuntoResidencial.Controller;

import com.example.QuizConjuntoResidencial.Model.zona_social;
import com.example.QuizConjuntoResidencial.Service.ZonaSocialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/zonas")
public class ZonaSocialController {

    @Autowired
    private ZonaSocialService zonaSocialService;

    @GetMapping
    public List<zona_social> getAll() {
        return zonaSocialService.findAll();
    }

    @PostMapping
    public zona_social save(@RequestBody zona_social zonaSocial) {
        return zonaSocialService.save(zonaSocial);
    }
}
