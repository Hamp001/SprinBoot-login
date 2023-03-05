package com.proyecto.Gimnasia.Servicios;

import com.proyecto.Gimnasia.Modelos.Registrar;
import com.proyecto.Gimnasia.repositorios.RegistrosRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class RegistrosService {
    @Autowired// para no volver a instanciar (spring ya sabe)
    RegistrosRepositorio registrosRepositorio;
    public ArrayList<Registrar> obtenerUsuario(){
        return (ArrayList<Registrar>) registrosRepositorio.findAll();
    }
    public Registrar guardarRegistro(Registrar registrar){
        return registrosRepositorio.save(registrar);
    }
        /*public ArrayList<Registrar> todosLosUsuarios(){
        return (ArrayList<Registrar>) registrosRepositorio.findRegistrarList();
    }*/
}
