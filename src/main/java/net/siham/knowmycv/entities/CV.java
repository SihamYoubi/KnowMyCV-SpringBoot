package net.siham.knowmycv.entities;

import jakarta.persistence.*;
import lombok.*;



import java.util.List;
@Entity @Getter @Setter
@NoArgsConstructor @AllArgsConstructor @Builder @ToString
public class CV {
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String about;
    @ElementCollection
    @CollectionTable(name="cv_skills" , joinColumns = @JoinColumn(name = "cv_id"))
    @Column(name="skill_name")
    private List<String> skills;
    @OneToMany(mappedBy = "cv", cascade = CascadeType.ALL)
    private List<Experience> experiences;
    @OneToMany(mappedBy = "cv", cascade = CascadeType.ALL)
    private List<Education> education;
    @OneToMany(mappedBy = "cv", cascade = CascadeType.ALL)
    private List<Project> projects;
    @OneToMany(mappedBy = "cv" , cascade = CascadeType.ALL )
    private List<Language> languages;

}
