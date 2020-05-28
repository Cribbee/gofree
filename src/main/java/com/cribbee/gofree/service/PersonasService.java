package com.cribbee.gofree.service;

import com.cribbee.gofree.entity.Personas;
import com.cribbee.gofree.util.ResultMsg;

public interface PersonasService{

    /**
     *
     * @param personas
     * @return
     */
    ResultMsg register(Personas personas);

}
