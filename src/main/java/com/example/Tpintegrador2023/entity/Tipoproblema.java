package com.example.Tpintegrador2023.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;
//se agregan los set y geter
@Data
@Entity
public class Tipoproblema {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Nombre;
    private String Tiempoestimado;

}
