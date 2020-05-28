package com.cribbee.gofree.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * ClassName: Personas
 * Description: TODO
 * Author: Cribbee
 * Date: 2020/5/24、2:18 PM
 * Version: 1.0
 **/

@Data
@Entity
@Table(name = "personas")
public class Personas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    private Integer usr_id;


//    private String economy;
//
//
//    private String sex;

    //自然风光
    private Float t1;


    private Float t2;


    private Float t3;


    private Float t4;


    private Float t5;


    private Float t6;


    private Float t7;


    private Float t8;


    private Float t9;


    private Float t10;


    private Float t11;


    private Float t12;


    private Float t13;


    private Float t14;

    //其他景点
    private Float t15;


    @Temporal(TemporalType.TIMESTAMP)
    private Date createtime;

    @Temporal(TemporalType.TIMESTAMP)
    private Date updatetime;


}
