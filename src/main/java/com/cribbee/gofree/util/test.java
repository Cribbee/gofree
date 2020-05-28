package com.cribbee.gofree.util;



import org.thymeleaf.util.DateUtils;

import java.util.Date;

/**
 * ClassName: test
 * Description: TODO
 * Author: Cribbee
 * Date: 2020/5/28、7:53 PM
 * Version: 1.0
 **/
public class test {
    public static void main(String[] args) {
        String startDay = "2020-04-01";

        String endDay = "2020-04-06";
        System.out.println(DataUtil.days(startDay,endDay));

    }
}
