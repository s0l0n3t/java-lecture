package com.furkantokgoz.ioclidili;


import jakarta.enterprise.context.ApplicationScoped;
import jakarta.faces.annotation.RequestMap;
import jakarta.faces.annotation.RequestParameterMap;
import jakarta.inject.Named;

@Named (value ="consumerClass")
@ApplicationScoped
public class ConsumerClass {
    private ConsumerClass consumerClass;


}
