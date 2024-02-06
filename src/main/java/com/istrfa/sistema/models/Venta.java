package com.istrfa.sistema.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.UUID;

@Entity
@Data
@Table(name="ventas", schema = "operaciones")
public class Venta {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false)
    private UUID idVenta;

    @Column(name = "cliente_id", nullable = false)
    private UUID clienteId;
    @Column(name = "usuario_id", nullable = false)
    private UUID usuarioId;

    @Column(name = "estado", nullable = false)
    private UUID estado;

    @Column(name = "fecha_registro", nullable = false)
    private Date fechaRegistro;
}
