package net.siham.knowmycv.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import net.siham.knowmycv.entities.CV;
public interface CVRepository extends JpaRepository <CV, Long> {
}
