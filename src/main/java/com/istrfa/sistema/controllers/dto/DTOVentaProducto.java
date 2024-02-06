package com.istrfa.sistema.controllers.dto;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.UUID;

@Getter
@Setter
public class DTOVentaProducto implements Serializable {
    private UUID idVentaProducto;
    private UUID idVenta;
    private UUID idProducto;
    private Double cantidad=0.0;
    private Double precio=0.0;
    private UUID unidadMedida;
}
