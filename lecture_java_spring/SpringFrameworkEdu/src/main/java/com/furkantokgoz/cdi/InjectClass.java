package com.furkantokgoz.cdi;


import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import lombok.Data;

import java.util.List;

@Data
@ApplicationScoped
@Named(value = "injectClass")
public class InjectClass {

    @Inject
    private List<String> consumer;

    public boolean consume(List<String> stringList){
        if(stringList.contains("C++")){
            return true;
        }
        return false;
    }

}
