package com.furkantokgoz.bean;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


import java.util.logging.Logger;
@Controller
public class PostConstructorTutorial {

//
//    @Autowired
//    Logger logger;

//    public PostConstructorTutorial() {
//        logger.info("PostConstructorTutorial called");
//    }
//
//    @PostConstruct
//    public void init() {
//        logger.info("PostConstruct called");
//    }
    public static void main(String[] args) {
        PostConstructorTutorial postConstruct = new PostConstructorTutorial();
    }
}
