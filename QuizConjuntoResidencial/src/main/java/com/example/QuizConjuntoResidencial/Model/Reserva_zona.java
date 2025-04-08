package com.example.QuizConjuntoResidencial.Model;

import jakarta.persistence.*;

import java.sql.Date;
import java.sql.Time;

@Entity
    @Table(name = "reserva_zona")
    public class Reserva_zona {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id_reserva")
        private Long id;

        private Date fecha;

        @Column(name = "hora_inicio")
        private Time horaInicio;

        @ManyToOne
        @JoinColumn(name = "id_zona")
        private zona_social zona_social;

        @ManyToOne
        @JoinColumn(name = "id_propietario")
        private Propietario propietario;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Time getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Time horaInicio) {
        this.horaInicio = horaInicio;
    }

    public zona_social getZona_social() {
        return zona_social;
    }

    public void setZona_social(zona_social zona_social) {
        this.zona_social = zona_social;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }
}
