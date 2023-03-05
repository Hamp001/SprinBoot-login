package com.proyecto.Gimnasia.controladores;

import com.proyecto.Gimnasia.Modelos.Registrar;
import com.proyecto.Gimnasia.Servicios.EnviarEmail;
import com.proyecto.Gimnasia.Servicios.RegistrosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import javax.validation.Valid;

@Controller
public class RegistrarController {
    @Autowired
    RegistrosService registrosService;
    @Autowired
    private EnviarEmail enviarEmail;
   @GetMapping("/registrar")
    public String Registrarse(Model model){
        model.addAttribute("registrar",new Registrar());
        return "registrar";
    }
    //@PostMapping(value = "/Registrar",params = {"Registrar"})
    @PostMapping("/registrar")
    public String guardarRegistro(@Valid @ModelAttribute("registrar") Registrar registrar, BindingResult result, Model model, RedirectAttributes redirectAttributes){
        Registrar registrar1=new Registrar();
        System.out.println(registrar.getContra());
        System.out.println(registrar.getConfirmContra());
        if(result.hasErrors() || !(registrar.getContra().equals(registrar.getConfirmContra()))){
            return "registrar";
        }else{
            registrar1.setNombre(registrar.getNombre());
            registrar1.setEmail(registrar.getEmail());
            registrar1.setContra(registrar.getContra());
            registrosService.guardarRegistro(registrar);
            System.out.println("Registro guardado");
           //enviarEmail.sendEmail(registrar1.getEmail(),"Registro Exitoso","Gracias por registrarte "+registrar1.getNombre());
            redirectAttributes.addFlashAttribute("Registro completado","Succescfully");
            return "redirect:/Bienvenida";
        }
    }
}
