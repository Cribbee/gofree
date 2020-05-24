package com.cribbee.gofree.service.impl;

import com.cribbee.gofree.dao.SightRepository;
import com.cribbee.gofree.dao.UserRepository;
import com.cribbee.gofree.entity.*;
import com.cribbee.gofree.service.SightService;
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
    public ResultMsg getSightsByDaysAndSightNum(GetSightRequest getSightRequest) {
        int days=getSightRequest.getDays();
        int sightsPerDay=getSightRequest.getSights_per();
        int sightCount=days*sightsPerDay;
        //简单获取几个景点
        List<Sight> sights = sightRepository.findByIdBetween(1,sightCount);
        double priceCount=0d;
        //就放在那几天里面,除一下
        ResultMsg resultMsg =new ResultMsg();
        ItineraryList itineraryList=new ItineraryList();
        itineraryList.setItineraries(new ArrayList<>());
        Itinerary itinerary=null;
        int dayOrder=1;
        double  pricePerDay =0;
        for(int i=0;i<sights.size();i++){
            Sight sight=sights.get(i);
            double price=sight.getPrice();
            priceCount+=price;
            pricePerDay+=price;
            if(i%sightsPerDay==0){
                itinerary=new Itinerary();
                itinerary.setDay(dayOrder);
                itineraryList.getItineraries().add(itinerary);
                dayOrder++;
            }
            if(itinerary.getSights()==null){
                itinerary.setSights(new ArrayList<>());
            }
            itinerary.getSights().add(sight);
            if(itinerary.getSights().size()==sightsPerDay){
                itinerary.setPrice_per(pricePerDay);
                pricePerDay=0;
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
