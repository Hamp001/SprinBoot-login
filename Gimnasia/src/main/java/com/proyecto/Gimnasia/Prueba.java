package com.proyecto.Gimnasia;

import com.proyecto.Gimnasia.Modelos.Ingresar;
import com.proyecto.Gimnasia.Modelos.Registrar;
import com.proyecto.Gimnasia.Servicios.EnviarEmail;
import com.proyecto.Gimnasia.Servicios.RegistrosService;

import com.proyecto.Gimnasia.repositorios.RegistrosRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Controller
public class Prueba {
    @Autowired
    private EnviarEmail enviarEmail;
    @Autowired
    private RegistrosService registrosService;
    @GetMapping("/email")
    public String email(){
        enviarEmail.sendEmail("a339020@uach.mx","prueba","mensaje");
        return "Mensaje Enviado";
    }
}
