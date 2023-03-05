package com.proyecto.Gimnasia.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
//http://192.168.1.71:8080/Bienvenida
@Controller
public class BienvenidaController {
    @GetMapping("/Bienvenida")
    public String Bienvenida(){
        return "Bienvenida";
    }
    @PostMapping(value = "/Bienvenida",params = {"Ingresar"})
    public String ingresar(Model model){
        //model.addAttribute("ingresar",new Ingresar());
        return "redirect:/ingresar";
    }
    @PostMapping(value = "/Bienvenida",params = {"Registrar"})
    public String registrarse(Model model){
        //model.addAttribute("Registrarse",new Registrar());
        return "redirect:/registrar";
    }
}
