package com.furkantokgoz.aop.decorator;

import jakarta.enterprise.context.Dependent;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Dependent
public class Garden implements IHome{
    private String text;

    @Override
    public String paint(String text) {
        return text;
    }
}
