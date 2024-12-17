package com.furkantokgoz.stereotype;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;
import lombok.*;

@MyStereoTypeClass
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode

public class StereoTypeBean {
    private String id;
    private String name = "Furkan";
    private String trade;
}
