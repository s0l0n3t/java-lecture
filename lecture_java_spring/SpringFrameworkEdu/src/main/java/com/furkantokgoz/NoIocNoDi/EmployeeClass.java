package com.furkantokgoz.NoIocNoDi;

import com.furkantokgoz.Config;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

@Named (value = "employeeClass")
@ApplicationScoped
public class EmployeeClass {

    private BossClass boss;
    {
        boss = new BossClass();
    }
    public String getName(){
        return boss.getName();
    }
    public String getVersion(){
        return boss.getVersion();
    }
}
