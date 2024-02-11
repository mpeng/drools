package com.navneet.drools.controller;

import com.navneet.drools.models.DroolsRequest;
import com.navneet.drools.models.DroolsResponse;
import com.navneet.drools.service.DroolsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.extern.log4j.Log4j2;

/**
 * @author navneetprabhakar
 * Sample Drools Rule controller
 */
@RestController
@Log4j2
@RequestMapping("v1/rules/")
public class DroolsController {

    @Autowired
    private DroolsService droolsService;


    /**
     * This POST API calculates total marks, percentage and passing grade based on the input provided
     * @param request
     * @return
     */
    @PostMapping("calculateResult")
    public DroolsResponse calculateResult(@RequestBody DroolsRequest request) {
        System.out.println( "Here1" );
        log.info("initiating calculate result");
        return droolsService.calcaulateResult(request);
    }

}
