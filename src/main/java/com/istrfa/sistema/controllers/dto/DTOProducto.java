package com.istrfa.sistema.controllers.dto;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@Getter
@Setter
public class DTOProducto implements Serializable {
    private UUID idProducto;
    private String nombre;
    private UUID tipo;
    private Double orden=0.0;
    private Double precio=0.0;
    private UUID unidadMedida;
    private UUID categoria;
    private UUID usuario;
    private Date fechaRegistro;
}
