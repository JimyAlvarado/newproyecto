package com.istrfa.sistema.controllers;

import com.istrfa.sistema.controllers.dto.DTOVenta;
import com.istrfa.sistema.services.VentaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/venta")
@Slf4j
public class VentaController {
    @Autowired
    VentaService ventaservice;

    @GetMapping("/listar")
    public ResponseEntity<List<DTOVenta>> listar(@RequestBody DTOVenta dto) {
        List<DTOVenta> dato = ventaservice.listar(dto);
        return new ResponseEntity<>(dato, HttpStatus.OK);
    }

    @PostMapping("/guardar")
    public ResponseEntity<String> guardar(@RequestBody DTOVenta dto) {
        ventaservice.guardar(dto);
        return new ResponseEntity<>("Registro guardado correctamente", HttpStatus.OK);
    }

    @PutMapping("actualizar/{id}")
    public ResponseEntity<String> actualizar(@RequestBody DTOVenta dto, @PathVariable(name = "id") UUID id) {
        ventaservice.actualizar(dto, id);
        return new ResponseEntity<>("Registro Actualizado correctamente", HttpStatus.OK);
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<String> eliminar(@PathVariable(name = "id") UUID id) {
        ventaservice.eliminar(id);
        return new ResponseEntity<>("Registro Eliminado correctamente", HttpStatus.OK);
    }
}
