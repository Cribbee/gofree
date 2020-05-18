package com.cribbee.gofree.dao;

import com.cribbee.gofree.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Integer>{

    /**
     * @param usr_name
     * @param pwd
     * @return
     * @throws Exception
     */
    @Query("select s from User s where s.usr_name = ?1 and s.passwd = ?2")
    User findUserByUsrNameAndPwd(String usr_name, String pwd);

    @Query("select s from User s where s.usr_name = ?1")
    User findUserByUsrName(String usr_name);

    @Query("select s from User s where s.nick_name = ?1")
    User findUserByNickName(String nick_name);

    @Query("select s from User s where s.phone = ?1")
    User findUserByPhone(String phone);

    @Query("select s from User s where s.email = ?1")
    User findUserByEmail(String email);
}
