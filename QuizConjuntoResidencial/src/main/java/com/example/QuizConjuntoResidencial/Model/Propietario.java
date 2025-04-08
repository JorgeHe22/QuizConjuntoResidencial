package com.example.QuizConjuntoResidencial.Model;

import jakarta.persistence.*;
import java.sql.Date;
import java.sql.Time;

@Entity
@Table(name = "propietario")
public class Propietario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_propietario")
    private Long id;

    private String nombre;
    private String cedula;

    @Column(name = "fecha_visita")
    private Date fechaVisita;

    @Column(name = "hora_entrada")
    private Time horaEntrada;

    // Getters y Setters

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCedula() { return cedula; }
    public void setCedula(String cedula) { this.cedula = cedula; }

    public Date getFechaVisita() { return fechaVisita; }
    public void setFechaVisita(Date fechaVisita) { this.fechaVisita = fechaVisita; }

    public Time getHoraEntrada() { return horaEntrada; }
    public void setHoraEntrada(Time horaEntrada) { this.horaEntrada = horaEntrada; }
}
