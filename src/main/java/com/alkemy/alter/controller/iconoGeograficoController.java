package com.alkemy.alter.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("iconosgeograficos") //ACA VA NOMBRE DE DATABASE
@CrossOrigin("*")
public class iconoGeograficoController {

    /*

    ESTE CONTROlLER ES SOLO PARA TESTEAR QUE LEVANTE El PROYECTO
    MÁS ADELANTE SERA REEMPLAZAR!!

     */
    @GetMapping("recurso") //ESTO ME CREA UNA RUTA EN LA DATABASE => localhost:8080/iconosgeograficos/recursos
    public String geticons(){ return "Testeo de Rest Controller";}

    @GetMapping // ACA ESTOY ENTRANDO EN localhost:8080/iconosgeograficos
    public String randomNumber(){return "This is a fking test";}
}
