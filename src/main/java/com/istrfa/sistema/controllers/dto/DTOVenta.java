package com.istrfa.sistema.controllers.dto;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@Getter
@Setter
public class DTOVenta implements Serializable {
    private UUID idVenta;
    private UUID clienteId;
    private UUID usuarioId;
    private UUID estado;
    private Date fechaRegistro;
}
