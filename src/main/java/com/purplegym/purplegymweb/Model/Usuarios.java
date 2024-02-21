package com.purplegym.purplegymweb.Model;

import com.purplegym.purplegymweb.DTO.Usuarios.UsuariosRequestDTO;
import com.purplegym.purplegymweb.Enums.UserRole;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
import java.util.UUID;

@Table(name = "Usuarios")
@Entity(name = "Usuarios")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Usuarios implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String nome;
    private String email;
    private String senha;
    @Enumerated(EnumType.STRING)
    private UserRole role;

    public Usuarios(UsuariosRequestDTO data) {
        this.nome = data.nome();
        this.email = data.email();
        this.senha = data.senha();
        this.role = data.role();
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        if (this.role == UserRole.ADMIN) return List.of(new SimpleGrantedAuthority("ROLE_ADMIN"), new SimpleGrantedAuthority("ROLE_USER"), new SimpleGrantedAuthority("ROLE_GUEST"));
        else if (this.role == UserRole.USER) return List.of(new SimpleGrantedAuthority("ROLE_USER"), new SimpleGrantedAuthority("ROLE_GUEST"));
        else if (this.role == UserRole.GUEST) return List.of(new SimpleGrantedAuthority("ROLE_GUEST"));
        else return List.of(new SimpleGrantedAuthority("ROLE_APP"));

    }
    @Override
    public String getPassword() {
        return getPassword();
    }

    @Override
    public String getUsername() {
        return email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
