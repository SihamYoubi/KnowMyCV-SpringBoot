package net.siham.knowmycv.entities;

import jakarta.persistence.*;
import lombok.*;
import net.siham.knowmycv.enums.RoleType;

@Entity @Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
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
