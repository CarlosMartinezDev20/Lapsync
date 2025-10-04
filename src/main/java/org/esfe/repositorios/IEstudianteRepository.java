package org.esfe.repositorios;

import org.esfe.modelos.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface IEstudianteRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
