package com.example.Tpintegrador2023.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
//se agregan los set y geter
@Data
@Entity
public class Incidente {
    private Long IncidenteId;
    private String Alias;
    private String Descripcion;
    private String Fechaestimada;
    private String Resuelto;
    private String Cliente_Id;
    private String Tipoproblema_Id;
    private String Tecnico_Id;
    
}
