package com.furkantokgoz.stereotype;


import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Stereotype;
import jakarta.inject.Named;
import lombok.*;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Stereotype
@Target({TYPE,METHOD,FIELD})
@Retention(RUNTIME)
@Documented

@Named
@ApplicationScoped
public @interface MyStereoTypeClass {
}
