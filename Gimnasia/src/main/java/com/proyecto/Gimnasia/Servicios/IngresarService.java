package com.proyecto.Gimnasia.Servicios;

import com.proyecto.Gimnasia.Modelos.Ingresar;
import com.proyecto.Gimnasia.Modelos.Registrar;
import com.proyecto.Gimnasia.repositorios.IngresarRepositorio;
import com.proyecto.Gimnasia.repositorios.RegistrosRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class IngresarService {
    @Autowired
    IngresarRepositorio ingresarRepositorio;
    public ArrayList<Registrar> obtenerUsuario(){
        return (ArrayList<Registrar>) ingresarRepositorio.findAll();
    }
    public boolean verificarInicioDeSesion (String usuario,String contra){
        if (ingresarRepositorio.VerificarUsuarioContra(usuario,contra)==1)
            return true;
        else
            return false;
    }
}
