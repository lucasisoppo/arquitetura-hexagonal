package com.imobiliaria.domain.port.out;

import com.imobiliaria.infrastructure.dto.EventImovelCriadoDto;

public interface NotificacaoPort {
    void notificarImovelCriado(EventImovelCriadoDto evento);
}
