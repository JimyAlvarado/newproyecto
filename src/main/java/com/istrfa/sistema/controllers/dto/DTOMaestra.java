package com.istrfa.sistema.controllers.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreType;
import jakarta.persistence.Column;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@Getter
@Setter
public class DTOMaestra implements Serializable {
    private UUID idMaestra=null;
    private String nombre;
    private String prefijo;
    private int orden=0;
    private int estado=1;
    private UUID padreId=null;
    private UUID usuario;
    private Date fechaRegistro;
}
