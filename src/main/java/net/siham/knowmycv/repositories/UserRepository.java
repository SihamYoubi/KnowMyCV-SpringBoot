package net.siham.knowmycv.repositories;

import net.siham.knowmycv.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
