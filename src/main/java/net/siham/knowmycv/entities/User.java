package net.siham.knowmycv.entities;

import jakarta.persistence.*;
import net.siham.knowmycv.enums.RoleType;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String firstName;
private String lastName;
private String email;
private String password;
private RoleType role; //admin , recruiter
}
