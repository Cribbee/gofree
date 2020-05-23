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


//    //所属景点id
//    private Integer parent_id;
//
//
//    private String child_id;


    public Sight() {
    }

    @Override
    public String toString() {
        return "Sight{" +
                "id=" + id +
                ", sight_name='" + sight_name + '\'' +
                ", city_id=" + city_id +
                ", score=" + score +
                ", rank=" + rank +
                ", cmt_num=" + cmt_num +
                ", tag='" + tag + '\'' +
                ", price=" + price +
                ", addr='" + addr + '\'' +
                ", url='" + url + '\'' +
                ", pic1='" + pic1 + '\'' +
                ", pic2='" + pic2 + '\'' +
                ", info='" + info + '\'' +
                ", open_time='" + open_time + '\'' +
                ", sight_desc='" + sight_desc + '\'' +
                ", tips='" + tips + '\'' +
                ", lng=" + lng +
                ", lat=" + lat +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSight_name() {
        return sight_name;
    }

    public void setSight_name(String sight_name) {
        this.sight_name = sight_name;
    }

    public Integer getCity_id() {
        return city_id;
    }

    public void setCity_id(Integer city_id) {
        this.city_id = city_id;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public Integer getCmt_num() {
        return cmt_num;
    }

    public void setCmt_num(Integer cmt_num) {
        this.cmt_num = cmt_num;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPic1() {
        return pic1;
    }

    public void setPic1(String pic1) {
        this.pic1 = pic1;
    }

    public String getPic2() {
        return pic2;
    }

    public void setPic2(String pic2) {
        this.pic2 = pic2;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getOpen_time() {
        return open_time;
    }

    public void setOpen_time(String open_time) {
        this.open_time = open_time;
    }

    public String getSight_desc() {
        return sight_desc;
    }

    public void setSight_desc(String sight_desc) {
        this.sight_desc = sight_desc;
    }

    public String getTips() {
        return tips;
    }

    public void setTips(String tips) {
        this.tips = tips;
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
}
