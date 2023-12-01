package com.example.Tpintegrador2023.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
     //se agregan los set y geter
@Data
@Entity

public class Cliente {
   @Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clienteId;

    private String firstRazonsocial;

    private String email;



     }
