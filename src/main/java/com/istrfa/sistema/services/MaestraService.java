package com.istrfa.sistema.services;

import com.istrfa.sistema.controllers.dto.DTOMaestra;
import com.istrfa.sistema.repository.MaestraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;
import java.util.UUID;

@Service
public class MaestraService {

    @Autowired
    MaestraRepository maestraRepository;

    public int guardar(DTOMaestra dto){
        try{
            /******** logica ****/
            return 200;
        }catch(Exception ex){
            return 500;
        }
    }

    public List<DTOMaestra> leer(DTOMaestra dto){
        try{
            List<DTOMaestra> listdatos = null;
            /********* logica ******/
            return listdatos;
        }catch (Exception ex){
            return null;
        }
    }
    public int actualizar(DTOMaestra dto, UUID id){
        try{
            /******** logica ****/
            return 200;
        }catch(Exception ex){
            return 500;
        }
    }
    public int eliminar(UUID id){
        try{
            /******** logica ****/
            return 200;
        }catch(Exception ex){
            return 500;
        }
    }
}