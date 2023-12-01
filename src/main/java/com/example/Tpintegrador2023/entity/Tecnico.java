package com.example.Tpintegrador2023.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;
//se agregan los set y geter
@Data
@Entity
public class Tecnico {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Nombre;
    private  String Email;
    private String  numeroTelefono;
    private String Especialidad;
    private String Resuelto;
    private String  Calificacion;



}
