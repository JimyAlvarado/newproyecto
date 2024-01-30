package com.istrfa.sistema.services;

import com.istrfa.sistema.controllers.dto.DTOProducto;
import com.istrfa.sistema.models.Producto;
import com.istrfa.sistema.repository.ProductoRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class ProductoService {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    ProductoRepository productoRepository;

    public int guardar(DTOProducto dto){
        try{
            Producto productoEntity=this.modelMapper.map(dto,Producto.class);
            productoRepository.save(productoEntity);
            return 200;
        }catch(Exception ex){
            return 500;
        }
    }
    public int actualizar(DTOProducto dto, UUID id){
        try{
            Producto productoEntity=this.modelMapper.map(dto,Producto.class);
            productoEntity.setIdProducto(id);
            productoRepository.save(productoEntity);
            return 200;
        }catch(Exception ex){
            return 500;
        }
    }

    public int eliminar(UUID id){
        try{
            Boolean existeDato=productoRepository.existsById(id);
            if(existeDato){
                productoRepository.deleteByIdProducto(id);
            }
            return 200;
        }catch(Exception ex){
            return 500;
        }
    }

    public List<DTOProducto> listar(DTOProducto dto){
        try{
            List<Producto> productoList=productoRepository.findByNombre(dto.getNombre());
            return productoList.stream().map(
                    x -> modelMapper.map(
                            x, DTOProducto.class)
                   ).collect(Collectors.toList());
        }catch(Exception ex){
            return null;
        }
    }
}
