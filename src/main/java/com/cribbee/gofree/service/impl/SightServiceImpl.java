package com.cribbee.gofree.service.impl;

import com.cribbee.gofree.dao.SightRepository;
import com.cribbee.gofree.entity.*;
import com.cribbee.gofree.service.SightService;
import com.cribbee.gofree.util.DataUtil;
import com.cribbee.gofree.util.ResultMsg;
import com.cribbee.gofree.util.ResultStatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SightServiceImpl implements SightService {

    @Autowired
    private SightRepository sightRepository;

    @Override
    public ResultMsg setItinerary(SetItineraryRequest setItineraryRequest) {
        //日期相减得到旅游天数
        int days = DataUtil.days(setItineraryRequest.getStartDay(), setItineraryRequest.getEndDay());
        Integer usr_id = setItineraryRequest.getUsr_id();
        Integer city_id = setItineraryRequest.getCity_id();
        Integer rhythm = setItineraryRequest.getRhythm();
        Integer style = setItineraryRequest.getStyle();

        int sightsPerDay;
        switch (rhythm) {
            case 0:
                sightsPerDay = 3;
                break;
            case 1:
                sightsPerDay = 2;
                break;
            case 2:
                sightsPerDay = 1;
                break;
            default:
                return new ResultMsg(ResultStatusCode.BAD_RHYTHM.getErrcode(), ResultStatusCode.BAD_RHYTHM.getErrmsg(), rhythm);
        }

        //整个行程的全部景点数量
        int totalSightCount = days * sightsPerDay;

        //简单获取几个景点
        List<Sight> sights = sightRepository.findSightByCityIdAndSightCount(city_id, totalSightCount);
        double priceCount = 0d;
        //就放在那几天里面,除一下
        ResultMsg resultMsg = new ResultMsg();
        ItineraryList itineraryList = new ItineraryList();
        itineraryList.setItineraries(new ArrayList<>());
        Itinerary itinerary = null;
        int dayOrder = 0;
        double pricePerDay = 0;
        for (int i = 0; i < sights.size(); i++) {
            Sight sight = sights.get(i);
            double price = sight.getPrice();
            pricePerDay += price;
            priceCount += pricePerDay;
            if (i % sightsPerDay == 0) {
                itinerary = new Itinerary();
                itinerary.setDay(dayOrder);
                itineraryList.getItineraries().add(itinerary);
                dayOrder++;
            }
            if (itinerary.getSights() == null) {
                itinerary.setSights(new ArrayList<>());
            }
            itinerary.getSights().add(sight);
            if (itinerary.getSights().size() == sightsPerDay) {
                itinerary.setPrice_per(pricePerDay);
            }
        }
        //在这里再计算总
        itineraryList.setTotal_price(priceCount);
        resultMsg.setCode(ResultStatusCode.OK.getErrcode());
        resultMsg.setMsg(ResultStatusCode.OK.getErrmsg());
        resultMsg.setData(itineraryList);
        return resultMsg;
    }
}
