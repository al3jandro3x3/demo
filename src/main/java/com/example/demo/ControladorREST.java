package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.domain.Individuo;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class ControladorREST {
    
    @Value("${indice.hola2}")
    private String hola2;

    @GetMapping ("/")
    public String comienzo(Model model){
        String hola = "Hola mundo con Spring Boot";


        Individuo indi = new Individuo();
        indi.setNombre("Alejandro");
        indi.setApellido("Aguilar");
        indi.setEdad("20");
        indi.setCorreo("ivxn.a.21@gmail.com");
        indi.setTelefono("55 6525-5274");

        Individuo indi2 = new Individuo();
        indi2.setNombre("Erika");
        indi2.setApellido("Ponce de León");
        indi2.setEdad("48");
        indi2.setCorreo("eryan_3@gmail.com");
        indi2.setTelefono("55 4935-8597");

        /* 
        List<Individuo> individuos = new ArrayList<>();
        individuos.add(indi);
        individuos.add(indi2);
        */
        

        List individuos = Arrays.asList(indi, indi2);

        log.info("Estoy ejecutando el controlador Spring-MVC");
        model.addAttribute("hola", hola);
        model.addAttribute("hola2", hola2);
        model.addAttribute("individuo", indi);
        model.addAttribute("individuos", individuos);

        return "indice";
    }
}
