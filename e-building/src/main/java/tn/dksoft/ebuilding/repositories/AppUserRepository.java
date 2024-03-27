package tn.dksoft.ebuilding.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.dksoft.ebuilding.entities.Tuser;

import java.util.Optional;

public interface AppUserRepository extends JpaRepository<Tuser,Long> {

    Optional<Tuser> findByUserName(String name);
    Optional<Tuser> findByEmail(String email);
    boolean existsByEmail(String email);

}
