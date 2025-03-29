package com.furkantokgoz.qualifier;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class dadClass {
    private int id;
    private String name;
    private final String surname = "Clipper";
    private int age;

}
