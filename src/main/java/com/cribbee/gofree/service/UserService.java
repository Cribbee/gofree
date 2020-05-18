package com.cribbee.gofree.service;


import com.cribbee.gofree.entity.User;
import com.cribbee.gofree.util.ResultMsg;
import org.springframework.data.jpa.repository.Query;

public interface UserService {

    /**
     * 根据用户id获取用户对象
     *
     * @param id
     */
    User getUserBuId(Integer id) throws Exception;


    /**
     * @param usr_name
     * @param pwd
     * @return
     * @throws Exception
     */
    @Query("select s from User s where s.userName = ?1 and s.pwd = ?2")
    User findUserByUsrNameAndPwd(String usr_name, String pwd);


    /**
     * 注册
     *
     * @param user
     * @return
     */
    ResultMsg register(User user);


    /**
     * @param user
     * @return
     * @throws Exception
     */
    ResultMsg login(User user);

}
