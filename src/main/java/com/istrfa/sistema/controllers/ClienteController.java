package com.istrfa.sistema.controllers;

import com.istrfa.sistema.controllers.dto.DTOCliente;
import com.istrfa.sistema.services.ClienteService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/cliente")
@Slf4j
public class ClienteController {

    /**
     * Listar Datos del Cliente
     **/
    @Autowired
    ClienteService clienteService;

    @GetMapping()
    public ResponseEntity<List<DTOCliente>> listar(@RequestBody DTOCliente dto){
        List<DTOCliente> datos=clienteService.listar(dto);
        return new ResponseEntity<>(datos, HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<String> guardar(@RequestBody DTOCliente dto){
        clienteService.guardar(dto);
        return new ResponseEntity<>("Registro guardado correctamente", HttpStatus.OK);
    }

    @PutMapping("{id}")
    public ResponseEntity<String> actualizar(
            @RequestBody DTOCliente dto,@PathVariable(name="id") UUID id){
        clienteService.actualizar(dto,id);
        return new ResponseEntity<>("Registro actualizado correctamente", HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> eliminar(@PathVariable(name="id") UUID id){
        clienteService.eliminar(id);
        return new ResponseEntity<>("Registro eliminado correctamente", HttpStatus.OK);
    }
}
