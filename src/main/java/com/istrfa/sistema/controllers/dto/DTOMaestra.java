package com.istrfa.sistema.controllers.dto;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@Getter
@Setter
public class DTOMaestra implements Serializable {
    private UUID idMaestra;
    private String prefijo;
    private String nombre;
    private int orden=0;
    private int estado=1;
    private UUID padreId;
    private UUID usuario;
    private Date fechaRegistro;
}
