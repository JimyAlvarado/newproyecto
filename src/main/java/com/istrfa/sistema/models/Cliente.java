package com.istrfa.sistema.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.UUID;

@Entity
@Data
@Table(name="clientes", schema="operaciones")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false)
    private UUID idCliente;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "apellidos", nullable = false)
    private String apellidos;

    @Column(name = "tipo_doc_identidad", nullable = false)
    private UUID tipoDocIdentidad;

    @Column(name = "numero_documento", nullable = false)
    private String numeroDocumento;

    @Column(name = "direccion", nullable = false)
    private String direccion;

    @Column(name = "correo", nullable = false)
    private String correo;

    @Column(name = "telefono", nullable = false)
    private String telefono;

    @Column(name = "fecha_nac", nullable = false)
    private Date fechaNacimiento;

    @Column(name = "usuario_id", nullable = false)
    private Date usuarioId;

    @Column(name = "fecha_registro", nullable = false)
    private Date fechaRegistro;

}
