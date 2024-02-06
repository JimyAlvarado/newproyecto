package com.istrfa.sistema.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {

    @GetMapping(value="saludo")
    public String listar(){
      return "Hola";
    }
}
