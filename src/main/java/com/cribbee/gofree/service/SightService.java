package com.cribbee.gofree.service;

import com.cribbee.gofree.entity.SetItineraryRequest;
import com.cribbee.gofree.util.ResultMsg;

public interface SightService {

    ResultMsg setItinerary(SetItineraryRequest setItineraryRequest);
}
