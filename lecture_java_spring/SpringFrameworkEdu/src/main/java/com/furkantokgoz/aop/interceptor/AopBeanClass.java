package com.furkantokgoz.aop.interceptor;


import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import lombok.Data;

import java.io.Serializable;

@Named(value = "aopIntercapter")
@ApplicationScoped
@Data
public class AopBeanClass implements Serializable {
    private static final long serialVersionUID = 1L;
    @Inject
    private LoginClass loginClass;

    public String getAop(){
        return this.loginClass.isLoginMethod(String.valueOf(this.serialVersionUID));
    }
}
