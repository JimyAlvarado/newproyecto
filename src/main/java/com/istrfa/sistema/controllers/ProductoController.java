package com.istrfa.sistema.controllers;

<<<<<<< HEAD
import com.istrfa.sistema.controllers.dto.DTOCliente;
import com.istrfa.sistema.controllers.dto.DTOProducto;
import com.istrfa.sistema.services.ClienteService;
=======
import com.istrfa.sistema.controllers.dto.DTOProducto;
>>>>>>> 18704b0949f20a5022cc72952d1ed7d1946bbaf7
import com.istrfa.sistema.services.ProductoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
<<<<<<< HEAD
@RequestMapping("/producto")
=======
@RequestMapping("/v1/producto")
>>>>>>> 18704b0949f20a5022cc72952d1ed7d1946bbaf7
@Slf4j
public class ProductoController {

    @Autowired
<<<<<<< HEAD
    ProductoService productoService;

    @GetMapping()
    public ResponseEntity<List<DTOProducto>> listar(@RequestBody DTOProducto dto){
        List<DTOProducto> datos=productoService.listar(dto);
        return new ResponseEntity<>(datos, HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<String> guardar(@RequestBody DTOProducto dto){
        productoService.guardar(dto);
        return new ResponseEntity<>("Registro guardado correctamente", HttpStatus.OK);
    }

    @PutMapping("{id}")
    public ResponseEntity<String> actualizar(
            @RequestBody DTOProducto dto, @PathVariable(name="id") UUID id){
        productoService.actualizar(dto,id);
        return new ResponseEntity<>("Registro actualizado correctamente", HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> eliminar(@PathVariable(name="id") UUID id){
        productoService.eliminar(id);
        return new ResponseEntity<>("Registro eliminado correctamente", HttpStatus.OK);
=======
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
>>>>>>> 18704b0949f20a5022cc72952d1ed7d1946bbaf7
    }
}
