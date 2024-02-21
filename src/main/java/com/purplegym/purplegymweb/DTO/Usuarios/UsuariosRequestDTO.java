package com.purplegym.purplegymweb.DTO.Usuarios;

import com.purplegym.purplegymweb.Enums.UserRole;

public record UsuariosRequestDTO(String nome, String email, String senha, UserRole role) {
}
