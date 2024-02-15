package com.istrfa.sistema.controllers;

import com.istrfa.sistema.controllers.dto.DTOProducto;
import com.istrfa.sistema.services.ProductoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/producto")
@Slf4j
public class ProductoController {

    @Autowired
    ProductoService service;

    @GetMapping("/listar")
    public ResponseEntity<List<DTOProducto>> listar(@RequestBody DTOProducto dto) {
        List<DTOProducto> dato = service.listar(dto);
        return new ResponseEntity<>(dato, HttpStatus.OK);
    }

    @PostMapping("/guardar")
    public ResponseEntity<String> guardar(@RequestBody DTOProducto dto) {
        service.guardar(dto);
        return new ResponseEntity<>("Registro guardado correctamente", HttpStatus.OK);
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<String> actualizar(@RequestBody DTOProducto dto, @PathVariable(name = "id") UUID id) {
        service.actualizar(dto, id);
        return new ResponseEntity<>("Registro Actualizado correctamente", HttpStatus.OK);
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<String> eliminar(@PathVariable(name = "id") UUID id) {
        service.eliminar(id);
        return new ResponseEntity<>("Registro Eliminado correctamente", HttpStatus.OK);
    }
}
