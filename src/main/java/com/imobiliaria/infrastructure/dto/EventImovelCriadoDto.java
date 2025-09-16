package com.imobiliaria.infrastructure.dto;

import java.io.Serializable;

public class EventImovelCriadoDto implements Serializable{
    public Long imovelId;
    public String endereco;
    public Long clienteId;

    public EventImovelCriadoDto(Long imovelId, String endereco, Long clienteId) {
        this.imovelId = imovelId;
        this.endereco = endereco;
        this.clienteId = clienteId;
    }
}
