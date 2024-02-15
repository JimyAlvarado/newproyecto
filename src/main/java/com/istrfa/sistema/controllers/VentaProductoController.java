package com.istrfa.sistema.controllers;

import com.istrfa.sistema.controllers.dto.DTOVentaProducto;
import com.istrfa.sistema.services.VentaProductoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/detalleventa")
@Slf4j
public class VentaProductoController {
    @Autowired
    VentaProductoService service;

    @GetMapping()
    public ResponseEntity<List<DTOVentaProducto>> listar(@RequestBody DTOVentaProducto dto) {
        List<DTOVentaProducto> dato = service.listar(dto);
        return new ResponseEntity<>(dato, HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<String> guardar(@RequestBody DTOVentaProducto dto) {
        service.guardar(dto);
        return new ResponseEntity<>("Registro guardado correctamente", HttpStatus.OK);
    }

    @PutMapping()
    public ResponseEntity<String> actualizar(@RequestBody DTOVentaProducto dto, @PathVariable(name = "id") UUID id) {
        service.actualizar(dto, id);
        return new ResponseEntity<>("Registro Actualizado correctamente", HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> eliminar(@PathVariable(name = "id") UUID id) {
        service.eliminar(id);
        return new ResponseEntity<>("Registro Eliminado correctamente", HttpStatus.OK);
    }
}

