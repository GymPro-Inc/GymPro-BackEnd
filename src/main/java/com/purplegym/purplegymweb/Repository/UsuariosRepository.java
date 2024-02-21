package com.purplegym.purplegymweb.Repository;


import com.purplegym.purplegymweb.Model.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface UsuariosRepository extends JpaRepository<Usuarios, UUID> {
}
