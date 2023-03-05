package com.proyecto.Gimnasia.repositorios;

import com.proyecto.Gimnasia.Modelos.Ingresar;
import com.proyecto.Gimnasia.Modelos.Registrar;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IngresarRepositorio extends CrudRepository<Registrar,Long> {
    @Query(value = "SELECT EXISTS(SELECT * FROM Registros WHERE nombre=:nombre AND contra=:contra) AS RESULT",
            nativeQuery = true)
    public int  VerificarUsuarioContra(@Param("nombre") String nombre,@Param("contra") String contra);
}
