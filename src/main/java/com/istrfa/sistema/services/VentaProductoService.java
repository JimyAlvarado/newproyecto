package com.istrfa.sistema.services;

import com.istrfa.sistema.controllers.dto.DTOProducto;
import com.istrfa.sistema.controllers.dto.DTOVentaProducto;
import com.istrfa.sistema.models.Producto;
import com.istrfa.sistema.models.VentaProducto;
import com.istrfa.sistema.repository.ProductoRepository;
import com.istrfa.sistema.repository.VentaProductoRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class VentaProductoService {
    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    VentaProductoRepository repository;

    public int guardar(DTOVentaProducto dto){
        try{
            VentaProducto entity=this.modelMapper.map(dto,VentaProducto.class);
            repository.save(entity);
            return 200;
        }catch(Exception ex){
            return 500;
        }
    }
    public int actualizar(DTOVentaProducto dto, UUID id){
        try{
            VentaProducto entity=this.modelMapper.map(dto,VentaProducto.class);
            entity.setIdVentaProducto(id);
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

    public List<DTOVentaProducto> listar(DTOVentaProducto dto){
        try{
            List<VentaProducto> listdata=repository.findAll();
            return listdata.stream().map(
                    y -> modelMapper.map(
                            y, DTOVentaProducto.class)
            ).collect(Collectors.toList());
        }catch(Exception ex){
            return null;
        }
    }
}
