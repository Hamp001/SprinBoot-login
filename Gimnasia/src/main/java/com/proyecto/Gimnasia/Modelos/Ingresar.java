package com.proyecto.Gimnasia.Modelos;

import com.proyecto.Gimnasia.Servicios.IngresarService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import java.io.Serializable;
public class Ingresar implements Serializable {
    /*@Autowired
    IngresarService ingresarService;*/


    @NotEmpty(message = "Favor de llenar el campo de usuario\n")
    private String usuario;
    //@Pattern()
    @NotEmpty(message = "Favor de ingresar una contraseña")
    private String contra;
    private boolean checarContra=true;
    public boolean isChecarContra() {
        return checarContra;
    }

    public void setChecarContra(boolean checarContra) {
        this.checarContra = checarContra;
    }


    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getContra() {
        return contra;
    }
    public void setContra(String contra) {
        this.contra = contra;
    }

}
