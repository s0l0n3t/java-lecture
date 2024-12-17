package com.furkantokgoz.ioclidili;


import jakarta.enterprise.context.ApplicationScoped;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@ApplicationScoped
@AllArgsConstructor
@NoArgsConstructor
public class PublisherClass implements IPublisher{
    private int id;
    private String name;

    @Override
    public String getObject() {
        return this.id + " " + this.name;
    }

}
