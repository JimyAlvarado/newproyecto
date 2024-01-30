package com.istrfa.sistema.repository;

import com.istrfa.sistema.models.Maestra;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MaestraRepository extends JpaRepository<Maestra, UUID> {
}