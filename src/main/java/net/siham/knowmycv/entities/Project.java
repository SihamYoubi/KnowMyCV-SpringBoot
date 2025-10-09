package net.siham.knowmycv.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Project {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private LocalDate startDate;
    private LocalDate endDate;

    @ManyToOne
    private CV cv;
}
