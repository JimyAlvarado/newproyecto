package com.istrfa.sistema.services;

import com.istrfa.sistema.controllers.dto.DTOCliente;
import com.istrfa.sistema.controllers.dto.DTOMaestra;
import com.istrfa.sistema.models.Cliente;
import com.istrfa.sistema.models.Maestra;
import com.istrfa.sistema.repository.MaestraRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class MaestraService {
    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    MaestraRepository maestraRepository;

    public int guardar(DTOMaestra dto){
        try{
            /******** logica ****/
            Maestra entity=this.modelMapper.map(dto, Maestra.class);
            maestraRepository.save(entity);
            return 200;
        }catch(Exception ex){
            return 500;
        }
    }
    public int actualizar(DTOMaestra dto, UUID id){
        try{
            Maestra entity=this.modelMapper.map(dto, Maestra.class);
            entity.setIdMaestra(id);
            maestraRepository.save(entity);
            return 200;
        }catch(Exception ex){
            return 500;
        }
    }

<<<<<<< HEAD
=======
    public List<DTOMaestra> listar(DTOMaestra dto){
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
>>>>>>> 18704b0949f20a5022cc72952d1ed7d1946bbaf7
    public int eliminar(UUID id){
        try{
            Boolean existeDato=maestraRepository.existsById(id);
            if(existeDato){
                maestraRepository.deleteById(id);
            }            return 200;
        }catch(Exception ex){    return 500;  }
    }
    public List<DTOMaestra> leer(DTOMaestra dto){
        try{
            List<Maestra> listdada=maestraRepository.findByNombre(dto.getNombre());
            return listdada.stream().map(
                    x -> modelMapper.map(
                            x, DTOMaestra.class)
            ).collect(Collectors.toList());
        }catch (Exception ex){  return null;  }
    }


}
