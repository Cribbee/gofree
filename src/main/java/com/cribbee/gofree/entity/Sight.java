package com.cribbee.gofree.entity;

import javax.persistence.*;

/**
 * ClassName: Sight
 * Description: TODO
 * Author: Cribbee
 * Date: 2020/2/18、11:15 AM
 * Version: 1.0
 **/



@Entity
@Table(name = "sight")
public class Sight {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    //所属区
    private Integer region_id;


    private String name;

    //标签
    private String tag;


    private String addr;

    //价格
    private Double price;

    //经度
    private Double lng;

    //维度
    private Double lat;

    //评论数量
    private Integer cmt_num;

    //景点描述
    private String sight_desc;

    //综合打分
    private Double score;


    private String tel;

    //耗时
    private String time_cost;

    //交通方式
    private String trans;

    //开放时间
    private String open_time;

    //景点图片
    private String main_image;

    //路径
    private String url;

    //所属景点id
    private Integer parent_id;


    private String child_id;


    public Sight() {
    }

    @Override
    public String toString() {
        return "Sight{" +
                "id=" + id +
                ", region_id=" + region_id +
                ", name='" + name + '\'' +
                ", tag='" + tag + '\'' +
                ", addr='" + addr + '\'' +
                ", price=" + price +
                ", lng=" + lng +
                ", lat=" + lat +
                ", cmt_num=" + cmt_num +
                ", sight_desc='" + sight_desc + '\'' +
                ", score=" + score +
                ", tel='" + tel + '\'' +
                ", time_cost='" + time_cost + '\'' +
                ", trans='" + trans + '\'' +
                ", open_time='" + open_time + '\'' +
                ", main_image='" + main_image + '\'' +
                ", url='" + url + '\'' +
                ", parent_id=" + parent_id +
                ", child_id='" + child_id + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRegion_id() {
        return region_id;
    }

    public void setRegion_id(Integer region_id) {
        this.region_id = region_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Integer getCmt_num() {
        return cmt_num;
    }

    public void setCmt_num(Integer cmt_num) {
        this.cmt_num = cmt_num;
    }

    public String getSight_desc() {
        return sight_desc;
    }

    public void setSight_desc(String sight_desc) {
        this.sight_desc = sight_desc;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getTime_cost() {
        return time_cost;
    }

    public void setTime_cost(String time_cost) {
        this.time_cost = time_cost;
    }

    public String getTrans() {
        return trans;
    }

    public void setTrans(String trans) {
        this.trans = trans;
    }

    public String getOpen_time() {
        return open_time;
    }

    public void setOpen_time(String open_time) {
        this.open_time = open_time;
    }

    public String getMain_image() {
        return main_image;
    }

    public void setMain_image(String main_image) {
        this.main_image = main_image;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getParent_id() {
        return parent_id;
    }

    public void setParent_id(Integer parent_id) {
        this.parent_id = parent_id;
    }

    public String getChild_id() {
        return child_id;
    }

    public void setChild_id(String child_id) {
        this.child_id = child_id;
    }
}
