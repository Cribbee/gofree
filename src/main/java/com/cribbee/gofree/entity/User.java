package com.cribbee.gofree.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;


/**
 * ClassName: User
 * Description: TODO
 * Author: Cribbee
 * Date: 2020/2/18、10:59 AM
 * Version: 1.0
 **/

@Data
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    private String usr_name;


    private String passwd;


    private String nick_name;


    private String phone;


    private String email;


    private String addr;


    @Temporal(TemporalType.TIMESTAMP)
    private Date createtime;

    @Temporal(TemporalType.TIMESTAMP)
    private Date updatetime;


}
