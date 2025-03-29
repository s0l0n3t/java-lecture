package com.furkantokgoz.qualifier;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Default;
import jakarta.inject.Named;
import lombok.Data;

@Data
@Named(value = "qualifiedSonClass")
@ApplicationScoped
@Default
public class sonClass extends dadClass implements Ifamily{
    private int id;
    private String name;
    public sonClass(){
        super();
    }
    @Override
    public String getSurname(){
        return super.getSurname();
    }
}
