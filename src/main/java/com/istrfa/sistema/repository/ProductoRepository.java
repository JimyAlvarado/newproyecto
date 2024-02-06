package com.istrfa.sistema.repository;

import com.istrfa.sistema.models.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

public interface ProductoRepository extends JpaRepository<Producto, UUID> {
    @Query("""
    SELECT P FROM Producto P
    WHERE lower(P.nombre) like '?1%'  """)
    List<Producto> findByNombre(String nombre);

}
