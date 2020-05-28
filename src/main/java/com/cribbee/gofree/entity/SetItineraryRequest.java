package com.cribbee.gofree.entity;

import lombok.Data;

@Data
public class SetItineraryRequest {

    Integer usr_id;

    Integer city_id;

    String startDay;

    String endDay;

    //旅游节奏 0:紧凑 1:适中 2:宽松
    Integer rhythm;

    //旅游风格 0:经济舒适 1:民俗特色 2:高端精品
    Integer style;
}
