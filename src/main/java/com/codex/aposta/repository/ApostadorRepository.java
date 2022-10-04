package com.codex.aposta.repository;

import com.codex.aposta.model.Apostador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ApostadorRepository extends JpaRepository<Apostador, Long> {
    static Optional<Apostador> findBYId(Long idApostador) {
        return null;
    }
}
