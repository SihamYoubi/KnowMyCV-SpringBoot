package net.siham.knowmycv.dtos;

import java.util.List;
import lombok.*;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor @Builder @ToString
public class CVDTO {
    private String about;
    private List<String> skills;
    private List<ExperienceDTO> experiences;
    private List<EducationDTO> education;
    private List<ProjectDTO> projects;
    private List<LanguageDTO> languages;
}

