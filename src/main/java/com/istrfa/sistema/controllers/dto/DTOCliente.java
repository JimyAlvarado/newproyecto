package com.istrfa.sistema.controllers.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@Getter
@Setter
public class DTOCliente implements Serializable {

    private UUID idCliente;
    private String nombre;
    private String apellidos;
    private UUID tipoDocIdentidad;
    private String numeroDocumento;
    private String direccion;
    private String correo;
    private String telefono;
    private Date fechaNacimiento;
    private Date usuarioId;
    private Date fechaRegistro;
}
