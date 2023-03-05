package com.proyecto.Gimnasia.Modelos;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@Entity//modelo real
@Table(name = "Registros")
public class Registrar implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable = false)
    private long id;

    @NotEmpty(message = "Favor de llenar el campo")
    private String nombre;
    @NotEmpty(message = "Favor de llenar el campo")
    @Email(message = "Debe ser una direccion de correo electronico")
    private String email;
    @NotEmpty(message = "Favor de ingresar una contraseña")
    private String contra;

    @Transient
    @NotEmpty(message = "Favor de volver a escribir su contraseña")
    private String confirmContra;

    public String getConfirmContra() {return confirmContra;}
    public void setConfirmContra(String confirmContra) {this.confirmContra = confirmContra;}
    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getContra() {return contra;}
    public void setContra(String contra) {
        this.contra = contra;
    }

}
