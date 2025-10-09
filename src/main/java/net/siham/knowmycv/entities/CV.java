package net.siham.knowmycv.entities;

import jakarta.persistence.*;


import java.util.List;
@Entity
public class CV {
    @Id
    private Long id;
    private String about;
    @ElementCollection
    private List<String> skill;
    @OneToMany(mappedBy = "cv", cascade = CascadeType.ALL)
    private List<Experience> experiences;
    @OneToMany(mappedBy = "cv", cascade = CascadeType.ALL)
    private List<Education> education;
    @OneToMany(mappedBy = "cv", cascade = CascadeType.ALL)
    private List<Project> projects;
    @OneToMany(mappedBy = "cv" , cascade = CascadeType.ALL )
    private List<Language> languages;

}
