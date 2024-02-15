package com.istrfa.sistema.services;

import com.istrfa.sistema.controllers.dto.DTOVenta;
import com.istrfa.sistema.controllers.dto.DTOVentaProducto;
import com.istrfa.sistema.models.Venta;
import com.istrfa.sistema.models.VentaProducto;
import com.istrfa.sistema.repository.VentaRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class VentaService {
    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    VentaRepository repository;

    public int guardar(DTOVenta dto){
        try{
            Venta entity=this.modelMapper.map(dto,Venta.class);
            repository.save(entity);
            return 200;
        }catch(Exception ex){
            return 500;
        }
    }
    public int actualizar(DTOVenta dto, UUID id){
        try{
            Venta entity=this.modelMapper.map(dto,Venta.class);
            entity.setIdVenta(id);
            repository.save(entity);
            return 200;
        }catch(Exception ex){
            return 500;
        }
    }

    public int eliminar(UUID id){
        try{
            Boolean existeDato=repository.existsById(id);
            if(existeDato){
                repository.deleteById(id);
            }
            return 200;
        }catch(Exception ex){
            return 500;
        }
    }

    public List<DTOVenta> listar(DTOVenta dto){
        try{
            List<Venta> listdata=repository.findAll();
            return listdata.stream().map(
                    y -> modelMapper.map(
                            y, DTOVenta.class)
            ).collect(Collectors.toList());
        }catch(Exception ex){
            return null;
        }
    }
}
