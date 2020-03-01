package com.cribbee.gofree.entity;

import javax.persistence.*;
import java.util.Date;


/**
 * ClassName: User
 * Description: TODO
 * Author: Cribbee
 * Date: 2020/2/18、10:59 AM
 * Version: 1.0
 **/

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


    @Temporal(TemporalType.DATE)
    private Date created_at;

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsr_name() {
        return usr_name;
    }

    public void setUsr_name(String usr_name) {
        this.usr_name = usr_name;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getNick_name() {
        return nick_name;
    }

    public void setNick_name(String nick_name) {
        this.nick_name = nick_name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", usr_name='" + usr_name + '\'' +
                ", passwd='" + passwd + '\'' +
                ", nick_name='" + nick_name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", addr='" + addr + '\'' +
                ", created_at=" + created_at +
                '}';
    }
}
