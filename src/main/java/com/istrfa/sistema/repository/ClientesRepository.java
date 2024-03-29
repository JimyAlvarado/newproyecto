package com.istrfa.sistema.repository;

import com.istrfa.sistema.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;


public interface ClientesRepository  extends JpaRepository<Cliente, UUID> {
    @Query("""
    select p from Cliente p
    where lower(p.nombre) like '?1%' """)
    List<Cliente> findByNombre(String nombre);

}
