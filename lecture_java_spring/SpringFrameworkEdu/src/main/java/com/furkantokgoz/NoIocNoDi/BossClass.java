package com.furkantokgoz.NoIocNoDi;

import com.furkantokgoz.Config;
import jakarta.enterprise.context.ApplicationScoped;
import lombok.Data;

@Data
public class BossClass {
    private String name;

    public BossClass() {
        this.name = "Furkan";
    }
    public String getVersion(){
        return Config.version;
    }
}
