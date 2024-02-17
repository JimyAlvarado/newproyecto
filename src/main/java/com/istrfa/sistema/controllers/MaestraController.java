package com.istrfa.sistema.controllers;

import com.istrfa.sistema.controllers.dto.DTOMaestra;
import com.istrfa.sistema.services.MaestraService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/v1/maestra")
@Slf4j
public class MaestraController {
    @Autowired
    MaestraService service;

    @GetMapping("/listar")
    public ResponseEntity<List<DTOMaestra>> listar(@RequestBody DTOMaestra dto) {
        List<DTOMaestra> dato = service.listar(dto);
        return new ResponseEntity<>(dato, HttpStatus.OK);
    }

    @PostMapping("/guardar")
    public ResponseEntity<String> guardar(@RequestBody DTOMaestra dto) {
        service.guardar(dto);
        return new ResponseEntity<>("Registro guardado correctamente", HttpStatus.OK);
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<String> actualizar(@RequestBody DTOMaestra dto, @PathVariable(name = "id") UUID id) {
        service.actualizar(dto, id);
        return new ResponseEntity<>("Registro Actualizado correctamente", HttpStatus.OK);
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<String> eliminar(@PathVariable(name = "id") UUID id) {
        service.eliminar(id);
        return new ResponseEntity<>("Registro Eliminado correctamente", HttpStatus.OK);
    }
}
