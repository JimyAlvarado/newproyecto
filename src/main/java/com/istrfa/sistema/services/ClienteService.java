package com.istrfa.sistema.services;

import com.istrfa.sistema.controllers.dto.DTOCliente;
import com.istrfa.sistema.models.Cliente;
import com.istrfa.sistema.repository.ClientesRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class ClienteService {
    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    ClientesRepository repo;

    public int guardar(DTOCliente dto){
        try{
            Cliente entity=this.modelMapper.map(dto, Cliente.class);
            repo.save(entity);
            return 200;
        }catch(Exception ex){
            return 500;
        }
    }
    public int actualizar(DTOCliente dto, UUID id){
        try{
            Cliente entity=this.modelMapper.map(dto, Cliente.class);
            entity.setIdCliente(id);
            repo.save(entity);
            return 200;
        }catch(Exception ex){
            return 500;
        }
    }

    public int eliminar(UUID id){
        try{
            Boolean existeDato=repo.existsById(id);
            if(existeDato){
                repo.deleteById(id);
            }
            return 200;
        }catch(Exception ex){
            return 500;
        }
    }

    public List<DTOCliente> listar(DTOCliente dto){
        try{
            List<Cliente> listdada=repo.findByNombre(dto.getNombre());
            return listdada.stream().map(
                    x -> modelMapper.map(
                            x, DTOCliente.class)
            ).collect(Collectors.toList());
        }catch(Exception ex){
            return null;
        }
    }
}
