package net.siham.knowmycv.mappers;

import net.siham.knowmycv.dtos.*;
import net.siham.knowmycv.entities.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CVMapperImpl {

public CVDTO fromCVToCVDTO(CV cv) {
    CVDTO CVDTO = new CVDTO();
    CVDTO.setAbout(cv.getAbout());
    CVDTO.setSkills(cv.getSkills());
    if (cv.getExperiences() != null) {
        List<ExperienceDTO> experienceDTO = cv.getExperiences().stream()
                .map(exp -> ExperienceDTO.builder()
                        .jobTitle(exp.getJobTitle())
                        .company(exp.getCompany())
                        .description(exp.getDescription())
                        .startDate(exp.getStartDate())
                        .endDate(exp.getEndDate())
                        .build())
                .toList();

        CVDTO.setExperiences(experienceDTO);
    }
    if (cv.getEducation() != null) {
        List<EducationDTO> eductionDTO = cv.getEducation().stream()
                .map(educ -> EducationDTO.builder()
                        .schoolName(educ.getSchoolName())
                        .degree(educ.getDegree())
                        .fieldOfStudy(educ.getFieldOfStudy())
                        .startDate(educ.getStartDate())
                        .endDate(educ.getEndDate())
                        .build())
                .toList();
        CVDTO.setEducation(eductionDTO);
    }
    if (cv.getProjects() != null) {
        List<ProjectDTO> projectDTO = cv.getProjects().stream().map(proj -> ProjectDTO
                        .builder()
                        .title(proj.getTitle())
                        .description(proj.getDescription())
                        .startDate(proj.getStartDate())
                        .endDate(proj.getEndDate())
                        .build())
                .toList();
        CVDTO.setProjects(projectDTO);
    }

    if(cv.getLanguages() != null){
        List<LanguageDTO> languageDTO = cv.getLanguages().stream().map(lang -> LanguageDTO
                .builder()
                .name(lang.getName())
                .level(lang.getLevel())
                .build())
                .toList();
    CVDTO.setLanguages(languageDTO);
    }

    return CVDTO;
}

public CV fromCVDTOToCV(CVDTO CVDTO){
    CV cv = new CV();
    cv.setAbout(CVDTO.getAbout());
    cv.setSkills(CVDTO.getSkills());

    // Convertir les ExperienceDTO en Experience
    if (CVDTO.getExperiences() != null) {
        List<Experience> experiences = CVDTO.getExperiences().stream()
                .map(dto -> Experience.builder()
                        .jobTitle(dto.getJobTitle())
                        .company(dto.getCompany())
                        .description(dto.getDescription())
                        .startDate(dto.getStartDate())
                        .endDate(dto.getEndDate())
                        .cv(cv) // c-a-d   Cette expérience appartient à ce CV précis.
                        .build())
                .toList();

        cv.setExperiences(experiences);
    }
    if(CVDTO.getEducation() != null) {
        List<Education> education = CVDTO.getEducation().stream()
                .map(dto -> Education.builder()
                        .schoolName(dto.getSchoolName())
                        .degree((dto.getDegree()))
                        .fieldOfStudy(dto.getFieldOfStudy())
                        .startDate(dto.getStartDate())
                        .endDate(dto.getEndDate())
                        .cv(cv)
                        .build())
                .toList();
        cv.setEducation(education);
    }
    if(CVDTO.getProjects() != null){
        List<Project> projects = CVDTO.getProjects().stream()
                .map(dto->Project.builder()
                        .title(dto.getTitle())
                        .description((dto.getDescription()))
                        .startDate(dto.getStartDate())
                        .endDate(dto.getEndDate())
                        .cv(cv)
                        .build())
                .toList();
        cv.setProjects(projects);
    }
    if(CVDTO.getLanguages() != null){
        List<Language> languages = CVDTO.getLanguages().stream()
                .map(dto-> Language.builder()
                        .name(dto.getName())
                        .level(dto.getLevel())
                        .cv(cv)
                        .build())
                .toList();
        cv.setLanguages(languages);
    }

    return cv;
}
}
