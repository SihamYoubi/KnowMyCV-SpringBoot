package net.siham.knowmycv.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Experience {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String jobTitle;
    private String Company;
    private String description;
    private LocalDate startDate ;
    private LocalDate endDate;


    @ManyToOne
    private CV cv;

}
