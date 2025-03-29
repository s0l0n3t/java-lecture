package com.furkantokgoz.cdi;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;
import jakarta.inject.Named;

import java.util.ArrayList;
import java.util.List;


@Named (value = "produceClass")
@ApplicationScoped
public class ProducesClass {


    @Produces
    public List<String> getList(){
        List<String> list = new ArrayList<String>();
        list.add("C");
        list.add("C++");
        list.add("Python");
        list.add("Java");
        return list;
    }
}
