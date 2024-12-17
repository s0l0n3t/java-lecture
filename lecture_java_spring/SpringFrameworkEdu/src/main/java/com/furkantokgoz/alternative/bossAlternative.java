package com.furkantokgoz.alternative;

import jakarta.enterprise.context.ApplicationScoped;
import lombok.Data;

@Data
@ApplicationScoped
public class bossAlternative {
    private int id;
    private String name;
    private FILE entitiyFile;

    public enum FILE{
        AUTOMOTIVE(10),
        HOME(5);

        public final int varValue;
        FILE(int varValue) {

            this.varValue = varValue;
        }
        public int getVarValue() {
            return varValue;
        }
    }
    public bossAlternative() {
        this.id = 1;
        this.name = "Furkan";
        this.entitiyFile = FILE.AUTOMOTIVE;
    }
}
