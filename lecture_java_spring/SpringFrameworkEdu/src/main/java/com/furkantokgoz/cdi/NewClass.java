package com.furkantokgoz.cdi;


import com.furkantokgoz.StudentDto;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Any;
import jakarta.enterprise.inject.Instance;
import jakarta.enterprise.inject.Produces;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import lombok.Getter;


@Named (value = "newClass")
@ApplicationScoped

public class NewClass {


    @Produces
    public String producedData() {
        StudentDto student = new StudentDto().builder()
                .studentId(0L).studentName("Furkan").studentSurname("Tokgoz")
                .build();
        return student.getStudentName();
    }

    @Inject
    @Getter
    private String consumedData;
}
