package tn.dksoft.ebuilding.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.dksoft.ebuilding.entities.Trole;

import java.util.Optional;

public interface AppRoleRepository extends JpaRepository<Trole, Long> {
    Optional<Trole> findByRoleName(String roleName);
}
