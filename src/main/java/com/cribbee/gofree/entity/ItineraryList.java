package com.cribbee.gofree.entity;

import lombok.Data;
import java.util.List;

@Data
public class ItineraryList {
    List<Itinerary> itineraries;
    Double total_price;
}
