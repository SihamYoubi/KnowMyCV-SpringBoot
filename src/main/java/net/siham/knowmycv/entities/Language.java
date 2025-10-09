package net.siham.knowmycv.entities;

import jakarta.persistence.*;

@Entity
public class Language {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;
    private String name;
    private String level;
    @ManyToOne
    private CV cv;
}
