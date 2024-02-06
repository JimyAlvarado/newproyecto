package com.istrfa.sistema.controllers;

import com.istrfa.sistema.services.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController(value = "producto")
public class ProductoController {

    @GetMapping()
    public String listar(){
        return "productos";
    }

    @PostMapping()
    public String guardar(){
        return "hola";
    }

    @PutMapping()
    public String actualizar(){
        return "hola";
    }

    @Autowired
    ProductoService service;
    @DeleteMapping("{id}")
    public ResponseEntity<String> eliminar(@PathVariable("id") UUID id ){
        service.eliminar(id);
        return ResponseEntity.ok("se elimino correctante");
    }
    //  https://desprobado.com/alumnotitulacion/eliminar/?idparam=123456987
}
