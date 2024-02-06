package com.istrfa.sistema.repository;

import com.istrfa.sistema.models.Venta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface VentaRepository extends JpaRepository<Venta, UUID> {
}
