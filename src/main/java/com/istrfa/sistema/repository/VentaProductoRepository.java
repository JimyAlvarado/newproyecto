package com.istrfa.sistema.repository;

import com.istrfa.sistema.models.VentaProducto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;



public interface VentaProductoRepository extends JpaRepository<VentaProducto, UUID> {

}
