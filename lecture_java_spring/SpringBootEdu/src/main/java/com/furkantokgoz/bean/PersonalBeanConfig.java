package com.furkantokgoz.bean;


import com.furkantokgoz.dto.PersonalDto;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class PersonalBeanConfig {

    @Bean
    @Scope("singleton")
    public PersonalDto PersonalBeanConfig() {
        return new PersonalDto(1,"username",null,"password");
    }
}
