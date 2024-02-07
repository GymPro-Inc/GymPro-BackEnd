package com.purplegym.purplegymweb.Repository;

import com.purplegym.purplegymweb.Model.Teste;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TesteRepository extends JpaRepository<Teste, UUID> {
}
