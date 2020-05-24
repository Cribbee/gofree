package com.cribbee.gofree.service;

import com.cribbee.gofree.entity.GetSightRequest;
import com.cribbee.gofree.entity.User;
import com.cribbee.gofree.util.ResultMsg;

public interface SightService {

    ResultMsg getSightsByDaysAndSightNum(GetSightRequest getSightRequest);
}
