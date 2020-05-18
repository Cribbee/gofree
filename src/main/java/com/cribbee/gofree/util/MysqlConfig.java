package com.cribbee.gofree.util;

import org.hibernate.dialect.MySQL5InnoDBDialect;

/**
 * ClassName: MysqlConfig
 * Description: TODO
 * Author: Cribbee
 * Date: 2020/5/18、6:19 PM
 * Version: 1.0
 **/
public class MysqlConfig extends MySQL5InnoDBDialect {
    @Override
    public String getTableTypeString(){
        return "ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci";
    }
}
