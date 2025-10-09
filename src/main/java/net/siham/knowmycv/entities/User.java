package net.siham.knowmycv.entities;

import jakarta.persistence.Enumerated;
import net.siham.knowmycv.enums.RoleType;

public class User {
private Long id;
private String firstName;
private String lastName;
private String email;
private String password;
private RoleType role;
}
