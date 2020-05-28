package com.cribbee.gofree.dao;

import com.cribbee.gofree.entity.Personas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PersonasRepository extends JpaRepository<Personas, Integer> {

    @Query("select s from Personas s where s.usr_id = ?1")
    Personas findPersonasByUsrId(Integer usr_id);

}
