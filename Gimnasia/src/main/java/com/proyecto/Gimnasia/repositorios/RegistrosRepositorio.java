package com.proyecto.Gimnasia.repositorios;

import com.proyecto.Gimnasia.Modelos.Registrar;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RegistrosRepositorio extends CrudRepository<Registrar,Long> {
    //querys personalisados
    @Query(value = "SELECT * FROM Registros WHERE nombre= 'hugo' ",nativeQuery = true)
    public List<Registrar> findRegistrarList();

}
