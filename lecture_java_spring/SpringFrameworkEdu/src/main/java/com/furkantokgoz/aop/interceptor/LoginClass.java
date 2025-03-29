package com.furkantokgoz.aop.interceptor;


import jakarta.enterprise.context.ApplicationScoped;
import lombok.NoArgsConstructor;

@InterceptorClass
@NoArgsConstructor
@ApplicationScoped
public class LoginClass {
    public String isLoginMethod(String data){
        return data+" is logged in";
    }
}
