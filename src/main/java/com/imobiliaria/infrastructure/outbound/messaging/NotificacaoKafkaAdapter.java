package com.imobiliaria.infrastructure.outbound.messaging;

import com.imobiliaria.domain.port.out.NotificacaoPort;
import com.imobiliaria.infrastructure.dto.EventImovelCriadoDto;
import jakarta.inject.Inject;
import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;

public class NotificacaoKafkaAdapter implements NotificacaoPort {

    @Inject
    @Channel("notificacoes-imoveis") // O nome do canal configurado no application.properties
    Emitter<EventImovelCriadoDto> emitter;

    @Override
    public void notificarImovelCriado(EventImovelCriadoDto evento) {
        emitter.send(evento);
    }
}
