package com.cribbee.gofree.service.impl;

import com.cribbee.gofree.dao.PersonasRepository;
import com.cribbee.gofree.dao.UserRepository;
import com.cribbee.gofree.entity.Personas;
import com.cribbee.gofree.service.PersonasService;
import com.cribbee.gofree.util.ResultMsg;
import com.cribbee.gofree.util.ResultStatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClassName: PersonasServiceImpl
 * Description: TODO
 * Author: Cribbee
 * Date: 2020/5/24、6:01 PM
 * Version: 1.0
 **/
@Service
public class PersonasServiceImpl implements PersonasService{

    @Autowired
    private PersonasRepository personasRepository;
    @Autowired
    private UserRepository userRepository;


    @Override
    public ResultMsg register(Personas personas) {
        Integer usr_id = personas.getUsr_id();
        if (!userRepository.exists(usr_id)){
            //说明该用户不存在
            return new ResultMsg(ResultStatusCode.USR_NOT_EXISTED.getErrcode(), ResultStatusCode.USR_NOT_EXISTED.getErrmsg(), "usr_id = "+ usr_id);
        }
        if (personasRepository.findPersonasByUsrId(usr_id) != null){
            //说明之前已经注册过用户画像了
            return new ResultMsg(ResultStatusCode.PERSONAS_EXISTED.getErrcode(), ResultStatusCode.PERSONAS_EXISTED.getErrmsg(), personasRepository.findPersonasByUsrId(usr_id));
        }
        Personas savedPersonas = personasRepository.save(personas);
        ResultMsg resultMsg = new ResultMsg(ResultStatusCode.OK.getErrcode(), ResultStatusCode.OK.getErrmsg(), savedPersonas);
        return resultMsg;
    }
}
