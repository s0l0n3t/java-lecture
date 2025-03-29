package com.furkantokgoz.data.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;

@MappedSuperclass
@Data
@Getter
@Setter
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"created_date,update_date"},allowGetters = true)
public class BaseEntity {
    @Id
    @Column(name = "id", nullable = false,updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "created_by")
    @CreatedBy
    private String createdBy;
    @Column(name = "updated_by")
    @LastModifiedBy
    private String updatedBy;
    @Column(name = "created_date")
    @CreatedDate
    private Date createdDate;
    @Column(name = "updated_date",nullable = false)
    @LastModifiedDate
    private Date updateDate;
    @Column(name = "system_auto_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;
}
