package com.cribbee.gofree.entity;

import lombok.Data;

import java.util.List;

@Data
public class Itinerary {
    Integer day;
    List<Sight> sights;
}

/*

{ "code":100,
    "message":"成功",
    "data":[
    {

}


 */