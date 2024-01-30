package com.istrfa.sistema.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.UUID;

@Entity
@Data
@Table(name="tb_maestra", schema="maestros")
public class Maestra {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false)
    private UUID idMaestra;
    @Column(name = "prefijo", nullable = false)
    private String prefijo;
    @Column(name = "nombre", nullable = false)
    private String nombre;
    @Column(name = "orden")
    private int orden=0;
    @Column(name = "estado")
    private int estado=1;
    @Column(name = "padre_id")
    private UUID padreId;
    @Column(name = "usuario_id", nullable = false)
    private UUID usuario;
    @Column(name = "fecha_registro", nullable = false)
    private Date fechaRegistro;
}
