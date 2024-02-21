package com.purplegym.purplegymweb.DTO.Usuarios;

import com.purplegym.purplegymweb.Model.Usuarios;
import java.util.UUID;

public record UsuariosResponseDTO(UUID id, String nome, String email, String senha) {

    public UsuariosResponseDTO(Usuarios usuario){
        this(usuario.getId(), usuario.getNome(), usuario.getEmail(), usuario.getSenha());
    }
}
