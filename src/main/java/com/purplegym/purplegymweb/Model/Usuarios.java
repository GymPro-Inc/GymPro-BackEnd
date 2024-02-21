package com.purplegym.purplegymweb.Model;

import com.purplegym.purplegymweb.DTO.Usuarios.UsuariosRequestDTO;
import jakarta.persistence.*;
import lombok.*;
import java.util.UUID;

@Table(name = "Usuarios")
@Entity(name = "Usuarios")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Usuarios {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String nome;
    private String email;
    private String senha;

    public Usuarios(UsuariosRequestDTO data) {
        this.nome = data.nome();
        this.email = data.email();
        this.senha = data.senha();
    }

}
