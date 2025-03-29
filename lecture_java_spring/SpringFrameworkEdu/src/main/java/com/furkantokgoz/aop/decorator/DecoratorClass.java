package com.furkantokgoz.aop.decorator;


import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named(value = "decoratorClass")
@ApplicationScoped
public class DecoratorClass {

    @Inject
    private IHome home;

    public String beanMethod(String text) {
        return home.paint(text);
    }
}
