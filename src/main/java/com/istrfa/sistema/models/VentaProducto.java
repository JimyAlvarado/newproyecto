package com.istrfa.sistema.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Data
@Entity
@Table(name="ventas_productos", schema="operaciones")
public class VentaProducto {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false)
    private UUID idVentaProducto;

    @Column(name = "venta_id", nullable = false)
    private UUID ventaId;
    @Column(name = "producto_id", nullable = false)
    private UUID productoId;

    @Column(name = "cantidad")
    private Double cantidad=0.0;

    @Column(name = "precio")
    private Double precio=0.0;

    @Column(name = "unidad_medida", nullable = false)
    private UUID unidadMedida;

}
