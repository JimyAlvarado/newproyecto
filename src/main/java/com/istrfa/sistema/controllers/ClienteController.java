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

    @Autowired
    ClienteService clientesServices;

    @GetMapping("/listar")
    public ResponseEntity<List<DTOCliente>> listar(@RequestBody DTOCliente dto) {
        List<DTOCliente> dato = clientesServices.listar(dto);
        return new ResponseEntity<>(dato, HttpStatus.OK);

    }

    @PostMapping("/guardar")
    public ResponseEntity<String> guardar(@RequestBody DTOCliente dto) {
        clientesServices.guardar(dto);
        return new ResponseEntity<>("Registro guardado correctamente", HttpStatus.OK);

    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<String> actualizar(@RequestBody DTOCliente dto, @PathVariable(name = "id") UUID id) {
        clientesServices.actualizar(dto, id);
        return new ResponseEntity<>("Registro Actualizado correctamente", HttpStatus.OK);

    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<String> eliminar(@PathVariable(name = "id") UUID id) {
        clientesServices.eliminar(id);
        return new ResponseEntity<>("Registro Eliminado correctamente", HttpStatus.OK);
    }
}

