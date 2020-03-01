package com.cribbee.gofree.controller;

import com.cribbee.gofree.dto.DataBaseExtractor;
import com.cribbee.gofree.service.SparkSubmitService;
import com.cribbee.gofree.util.ResultMsg;
import com.cribbee.gofree.util.ResultStatusCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.io.IOException;

/**
 * ClassName: SparkTestController
 * Description: TODO
 * Author: Cribbee
 * Date: 2020/3/1、5:13 PM
 * Version: 1.0
 **/

@Slf4j
@Controller
public class SparkTestController {
    @Resource
    private SparkSubmitService SparkSubmitService;
    /**
     * 调用service进行远程提交spark任务
     * @param  dbe 页面参数
     * @return 执行结果
     */
    @ResponseBody
    @PostMapping("/extract/database")
    public Object dbExtractAndLoad2Hdfs(@RequestBody DataBaseExtractor dbe){
        try {
            return SparkSubmitService.submitApplication(dbe.getSparkTestParam(),
                    dbe.getUrl(),
                    dbe.getTable(),
                    dbe.getUserName(),
                    dbe.getPassword(),
                    dbe.getTargetFileType(),
                    dbe.getTargetFilePath());
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            log.error("执行出错：{}", e.getMessage());
            ResultMsg resultMsg = new ResultMsg(ResultStatusCode.SYSTEM_ERR.getErrcode(), ResultStatusCode.SYSTEM_ERR.getErrmsg(), dbe);
            return resultMsg;
        }
    }

}
