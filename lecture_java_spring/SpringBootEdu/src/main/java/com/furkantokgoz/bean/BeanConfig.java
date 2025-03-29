package com.furkantokgoz.bean;

import com.furkantokgoz.dto.BeanDto;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanConfig {

    @Bean(initMethod = "initialBean",destroyMethod = "finalBean")
    @Scope("singleton")//request session
    public BeanDto getBeanDto() {
        return new BeanDto(0L,"Started !","springbootBean");
    }
}
