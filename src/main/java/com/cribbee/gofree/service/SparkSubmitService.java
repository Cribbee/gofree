package com.cribbee.gofree.service;


import com.cribbee.gofree.entity.SparkTest;

import java.io.IOException;

/**
 * @Author cribbee
 * @description spark任务提交service
 **/
public interface SparkSubmitService {
    /**
     * 提交spark任务入口
     * @param sparkAppParams spark任务运行所需参数
     * @param otherParams 单独的job所需参数
     * @return 结果
     * @throws IOException          io
     * @throws InterruptedException 线程等待中断异常
     */
    String submitApplication(SparkTest sparkAppParams, String... otherParams) throws IOException, InterruptedException;

}
