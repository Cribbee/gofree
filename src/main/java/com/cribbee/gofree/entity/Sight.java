package com.cribbee.gofree.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * ClassName: Sight
 * Description: TODO
 * Author: Cribbee
 * Date: 2020/2/18、11:15 AM
 * Version: 1.0
 **/


@Data
@Entity
@Table(name = "sight")
public class Sight {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String sight_name;

    //所属城市
    private Integer city_id;

    //综合打分
    private Double score;

    //综合打分排名
    private Integer rank;

    //评论数量
    private Integer cmt_num;

    //标签
    private String tag;

    //价格
    private Double price;


    private String addr;

    //路径
    private String url;

    //主图
    private String pic1;

    //副图
    private String pic2;

    //景点信息
    private String info;

    //开发时间
    private String open_time;

    //景点描述
    private String sight_desc;

    //小tips
    private String tips;


    //经度
    private Double lng;

    //维度
    private Double lat;

    //所属区
    private String district;


//    //所属景点id
//    private Integer parent_id;
//
//
//    private String child_id;


    public Sight() {
    }


}
