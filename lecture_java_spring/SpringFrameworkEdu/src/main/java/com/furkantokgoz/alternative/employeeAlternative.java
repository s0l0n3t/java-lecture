package com.furkantokgoz.alternative;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;
import jdk.jfr.Name;
import lombok.Data;

@Named(value = "employeeAlternative")
@ApplicationScoped
@Data
public class employeeAlternative extends bossAlternative implements Iboss {
    private String employeeName;
    private String bossName;
    private String varSurum;


    public employeeAlternative() {
        super();
        this.employeeName = "Ahmet";
        this.varSurum = "1.0.0";

    }
    @Override
    public String getString(){
        return  this.employeeName + " " + this.getName() + " " +this.getEntitiyFile().getVarValue() +" " +this.getEntitiyFile() +" "+ this.getVarSurum();
    }
    public String test(){
        return this.employeeName;
    }
}
