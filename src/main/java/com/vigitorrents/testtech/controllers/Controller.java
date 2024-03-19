package com.vigitorrents.testtech.controllers;

import com.vigitorrents.testtech.entities.Position;
import com.vigitorrents.testtech.services.SmsSender;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.smsapi.exception.SmsapiException;

import java.util.List;

@RestController
@Tag(name = "Vigi-Torrents")
class Controller {
    @Autowired
    private SmsSender smsSender;

    private int indexPosition = 0;
    private final List<Position> positions = List.of(
            new Position(45.0, 5.0),
            new Position(45.1, 5.1),
            new Position(45.2, 5.2)
    );

    @GetMapping(value = {"/api/position", "/_ah/warmup"})
    @CrossOrigin
    @Operation(summary = "La position est piochée aléatoirement le long du torrent à l'amont")
    Position getPosition() {
        indexPosition++;
        return positions.get(indexPosition % positions.size());
    }

    @GetMapping(value = {"/api/informations"})
    @CrossOrigin
    @Operation(summary = "Retourne des infos diverses en texte libre")
    String getInformations() {
        return "Blabla";
    }

    @PostMapping(value = {"/api/sendSMS"})
    @CrossOrigin
    @Operation(summary = "Envoie un SMS")
    String sendSMS(@RequestParam String mobileNumber, @RequestParam String message, @RequestParam String accessToken) throws SmsapiException {
        return smsSender.send(mobileNumber, message, accessToken).getList().get(0).getStatus();
    }
}
