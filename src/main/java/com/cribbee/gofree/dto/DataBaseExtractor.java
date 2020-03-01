package com.cribbee.gofree.dto;

import com.cribbee.gofree.entity.SparkTest;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ClassName: DataBaseExtractor
 * Description: TODO
 * Author: Cribbee
 * Date: 2020/3/1、5:10 PM
 * Version: 1.0
 **/

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DataBaseExtractor extends SparkTest {
    /**
     * 数据库连接地址
     */
    private String url;
    /**
     * 数据库连接账号
     */
    private String userName;
    /**
     * 数据库密码
     */
    private String password;
    /**
     * 指定的表名
     */
    private String table;
    /**
     * 目标文件类型
     */
    private String targetFileType;
    /**
     * 目标文件保存路径
     */
    private String targetFilePath;
}
