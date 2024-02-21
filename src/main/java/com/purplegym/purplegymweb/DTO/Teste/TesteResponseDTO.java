package com.purplegym.purplegymweb.DTO.Teste;

import com.purplegym.purplegymweb.Model.Teste;
import java.util.UUID;

public record TesteResponseDTO(UUID id, String teste) {

    public TesteResponseDTO(Teste teste){
        this(teste.getId(), teste.getTeste());
    }
}
