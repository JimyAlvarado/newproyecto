package com.istrfa.sistema.repository;

import com.istrfa.sistema.models.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

public interface ProductoRepository extends JpaRepository<Producto, UUID> {
     long deleteByIdProducto(UUID idProducto);

    @Query("""
    select p from producto p
    where lower(p.nombre) like '?1%' """)
    List<Producto> findByNombre(String nombre);


}
