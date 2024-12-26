package com.furkantokgoz.controller;

import com.furkantokgoz.bean.BeanConfig;
import com.furkantokgoz.dto.BeanDto;
import lombok.extern.java.Log;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class BeanController {

    @Autowired
    BeanConfig beanConfig;
    //https://localhost:8080/bean/beanDto
    @GetMapping("/bean/beanDto") //url yapısıdır.
//    @ResponseBody //html olmadan direk ekranda göster.
    public BeanDto getBeanConfig() {
        return beanConfig.getBeanDto();
    }

}
