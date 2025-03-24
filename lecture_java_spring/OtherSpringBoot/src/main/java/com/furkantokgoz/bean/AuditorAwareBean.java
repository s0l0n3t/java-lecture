package com.furkantokgoz.bean;

import com.furkantokgoz.audit.AuditAwareImpl;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;

@Configuration
public class AuditorAwareBean {
    public AuditorAware<String> auditorAware() {
        return new AuditAwareImpl();
    }
}
