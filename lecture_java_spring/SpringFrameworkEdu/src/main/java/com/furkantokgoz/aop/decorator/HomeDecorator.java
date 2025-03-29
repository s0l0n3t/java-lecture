package com.furkantokgoz.aop.decorator;

import jakarta.decorator.Decorator;
import jakarta.decorator.Delegate;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;



@Decorator
abstract public class HomeDecorator implements IHome{
    @Inject @Delegate
    private IHome iHome;

    @Override
    public String paint(String text){
        System.out.println("decorater was here.");
        String dataInfo = iHome.paint(text);
        if(dataInfo.equals("ahmet")){
            return "found !";
        }
        return dataInfo;
    }
}
