package com.furkantokgoz.bean;


import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import lombok.Getter;
import lombok.Setter;

@Named(value = "cdiBean")
@ApplicationScoped
@Getter
@Setter
public class JsfBean {
    private String message;
    public JsfBean() {
        this.message = "Welcome to web world !";
    }
}
