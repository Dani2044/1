package com.javematch.match.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Usuario {
    @Id
    private Long idUsuario;
    private String nombre;
    private int edad;
    private Boolean genero; // Como debe ser
    private String ubicacion;
    private String biografia;
}