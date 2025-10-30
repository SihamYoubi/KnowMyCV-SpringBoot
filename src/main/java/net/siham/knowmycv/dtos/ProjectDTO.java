package net.siham.knowmycv.dtos;

import lombok.*;

import java.time.LocalDate;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor @Builder
@ToString
public class ProjectDTO {
    private String title;
    private String description;
    private LocalDate startDate;
    private LocalDate endDate;
}
