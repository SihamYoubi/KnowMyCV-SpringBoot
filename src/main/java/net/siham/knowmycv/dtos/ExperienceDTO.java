package net.siham.knowmycv.dtos;

import lombok.*;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ExperienceDTO {
    private String jobTitle;
    private String company;
    private String description;
    private LocalDate startDate;
    private LocalDate endDate;
}

