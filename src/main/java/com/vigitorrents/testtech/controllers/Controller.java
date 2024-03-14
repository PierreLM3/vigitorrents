package com.vigitorrents.testtech.controllers;

import com.vigitorrents.testtech.entities.Position;
import com.vigitorrents.testtech.repositories.SignalementsRepository;
import com.vigitorrents.testtech.repositories.SubscriptionsRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Tag(name = "Vigi-Torrents")
class Controller {
    private final SignalementsRepository signalementsRepository;
    private final SubscriptionsRepository subscriptionsRepository;

    private int indexPosition = 0;
    private List<Position> positions = List.of(
            new Position(45.0, 5.0),
            new Position(45.1, 5.1),
            new Position(45.2, 5.2)
    );

    public Controller(SignalementsRepository signalementsRepository, SubscriptionsRepository subscriptionsRepository) {
        this.signalementsRepository = signalementsRepository;
        this.subscriptionsRepository = subscriptionsRepository;
    }

    @GetMapping(value = {"/api/position", "/_ah/warmup"})
    @CrossOrigin
    @Operation(summary = "La position est piochée aléatoirement le long du torrent à l'amont", description = "La position est piochée aléatoirement le long du torrent à l'amont")
    Position getPosition() {
        indexPosition++;
        return positions.get(indexPosition % positions.size());
    }
}
