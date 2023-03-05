package com.proyecto.Gimnasia.controladores;

import com.proyecto.Gimnasia.Modelos.Ingresar;
import com.proyecto.Gimnasia.Servicios.IngresarService;
import com.proyecto.Gimnasia.Servicios.RegistrosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class IngresarController {
    @Autowired
    IngresarService ingresarService;

   @GetMapping("/ingresar")
    public String Ingresar(Model model){
        model.addAttribute("ingresar",new Ingresar());
        return "ingresar";
    }
    @PostMapping("/ingresar")
    public String obtenerDatos(@Valid @ModelAttribute Ingresar ingresar, BindingResult result,Model model){
        Ingresar ingresar1=new Ingresar();
        System.out.println(ingresarService.verificarInicioDeSesion(ingresar.getUsuario(), ingresar.getContra()));
        //para mostrar mensaje si el usuario o contra son incorrectos
        ingresar.setChecarContra(ingresarService.verificarInicioDeSesion(ingresar.getUsuario(), ingresar.getContra()));
        if(ingresar.isChecarContra()==true && !result.hasErrors())
            return "DatosIngresar";
        else
            return "ingresar";
    }
    /*@PostMapping("/ingresar")
    public String obtenerDatos(@ModelAttribute Ingresar ingresar){
       Ingresar ingresar1=new Ingresar();
        System.out.println(ingresarService.verificarInicioDeSesion(ingresar.getUsuario(), ingresar.getContra()));
        if(ingresarService.verificarInicioDeSesion(ingresar.getUsuario(), ingresar.getContra())==true)
            return "DatosIngresar";
        else
            return "ingresar";
    }*/
}
