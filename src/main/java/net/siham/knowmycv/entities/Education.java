package net.siham.knowmycv.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.time.LocalDate;

@Entity
public class Education {
    @Id
    private Long id;
    private String schoolName;
    private String degree;
    private String fieldOfStudy;
    private LocalDate startDate;
    private LocalDate endDate;
    @ManyToOne
    private CV cv;
}
