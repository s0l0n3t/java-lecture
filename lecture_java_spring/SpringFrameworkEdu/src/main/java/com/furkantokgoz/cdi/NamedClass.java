package com.furkantokgoz.cdi;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;
import jdk.jfr.Name;
import lombok.*;
import lombok.extern.log4j.Log4j2;

@Data
@AllArgsConstructor //Parametreli constructor yapısı
@Builder

//cdi ==> bean
@Named (value = "namedTutorial")
@ApplicationScoped

public class NamedClass {
    private Long namedId;
    private String namedData;

    
    public NamedClass(){
        this.namedData ="Hello, its NamedClass cdi bean";
    }
}
