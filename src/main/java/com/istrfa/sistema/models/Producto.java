package com.istrfa.sistema.models;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;
import java.util.UUID;

@Entity
@Data
@Table(name="tb_productos", schema="maestros")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false)
    private UUID idProducto;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "tipo", nullable = false)
    private UUID tipo;

    @Column(name = "cantidad")
    private Double orden=0.0;

    @Column(name = "precio")
    private Double precio=0.0;

    @Column(name = "unidad_media")
    private UUID unidadMedida;

    @Column(name = "categoria")
    private UUID categoria;

    @Column(name = "usuario_id", nullable = false)
    private UUID usuario;

    @Column(name = "fecha_registro", nullable = false)
    private Date fechaRegistro;
}
