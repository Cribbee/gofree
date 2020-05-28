package com.cribbee.gofree.entity;

import lombok.Data;

import java.util.List;

@Data
public class Itinerary {
    Integer day;
    List<Sight> sights;
    Double price_per;
}
