package com.furkantokgoz.dto;


import jakarta.persistence.Entity;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NotEmpty(message = "This field can not be empty.")
public class PersonalDto {
    private long id;
    private String username;
    private String email;
    @Size(min = 3,max = 20,message = "3-20 needed characters")
    private String password;
}
