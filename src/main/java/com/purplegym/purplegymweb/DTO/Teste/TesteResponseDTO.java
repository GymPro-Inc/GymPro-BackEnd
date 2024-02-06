package com.purplegym.purplegymweb.DTO;

import com.purplegym.purplegymweb.Model.Teste;

public record TesteResponseDTO(Long id, String teste) {

    public TesteResponseDTO(Teste teste){
        this(teste.getId(), teste.getTeste());
    }
}
