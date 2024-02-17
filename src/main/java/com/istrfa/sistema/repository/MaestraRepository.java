package com.istrfa.sistema.repository;

import com.istrfa.sistema.models.Maestra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

public interface MaestraRepository extends JpaRepository<Maestra, UUID> {
    @Query("""
    SELECT m FROM Maestra m
    WHERE lower(m.nombre) like '?1%' """)
    List<Maestra> findByNombre(String nombre);
}