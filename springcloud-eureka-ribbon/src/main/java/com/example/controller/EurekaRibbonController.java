package com.example.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.EurekaRibbonService;

@RestController
public class EurekaRibbonController {
 
    @Resource
    private EurekaRibbonService eurekaRibbonService;
 
    @RequestMapping("/ribbonInfo")
    public String ribbonInfo() {
        String message = eurekaRibbonService.getInfo();
        return "获取的信息:" + message;
    }
 
}