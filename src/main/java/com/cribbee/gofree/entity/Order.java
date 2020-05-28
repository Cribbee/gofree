//package com.cribbee.gofree.entity;
//
//import lombok.Data;
//
//import javax.persistence.*;
//import java.util.Date;
//
///**
// * ClassName: Order
// * Description: TODO
// * Author: Cribbee
// * Date: 2020/5/24、4:41 PM
// * Version: 1.0
// **/
//
//@Data
//@Entity
//@Table(name = "order")
//public class Order {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Integer id;
//
//
//    private Integer usr_id;
//
//
//    private Integer city_id;
//
//
//    private Double total_price;
//
//    //旅游节奏 0:紧凑 1:适中 2:宽松
//    private Integer rhythm;
//
//    //旅游风格 0:经济舒适 1:民俗特色 2:高端精品
//    private Integer style;
//
//
//    private Date start_day;
//
//
//    private Date end_day;
//
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date createtime;
//
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date updatetime;
//}
