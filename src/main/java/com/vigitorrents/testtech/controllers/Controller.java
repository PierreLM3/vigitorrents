package com.vigitorrents.testtech.controllers;

import com.vigitorrents.testtech.entities.Position;
import com.vigitorrents.testtech.entities.Signalement;
import com.vigitorrents.testtech.entities.Subscription;
import com.vigitorrents.testtech.repositories.SignalementsRepository;
import com.vigitorrents.testtech.repositories.SubscriptionsRepository;
import com.vigitorrents.testtech.services.SmsSender;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.smsapi.exception.SmsapiException;

import java.util.List;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

@RestController
@Tag(name = "Vigi-Torrents")
class Controller {
    @Autowired
    private SignalementsRepository signalementsRepository;
    @Autowired
    private SubscriptionsRepository subscriptionsRepository;
    @Autowired
    private SmsSender smsSender;

    private int indexPosition = 0;
    private final List<Position> positions = List.of(
            new Position(45.0, 5.0),
            new Position(45.1, 5.1),
            new Position(45.2, 5.2)
    );

    public Controller() {}

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

    @PostMapping(value = {"/api/signalement"})
    @CrossOrigin
    @Operation(summary = "Enregistre un nouveau signalement")
    Signalement postSignalement(@RequestBody Signalement signalement) {
        return signalementsRepository.save(signalement);
    }

    @GetMapping(value = {"/api/signalements"})
    @CrossOrigin
    @Operation(summary = "Récupère tous les signalements enregistrés")
    Iterable<Signalement> getSignalements() {
        return signalementsRepository.findAll();
    }

    @PostMapping(value = {"/api/subscription"})
    @CrossOrigin
    @Operation(summary = "Enregistre une nouvelle souscription")
    Subscription postSubscription(@RequestBody Subscription subscription) {
        return subscriptionsRepository.save(subscription);
    }

    @GetMapping(value = {"/api/subscriptions"})
    @CrossOrigin
    @Operation(summary = "Récupère toutes les souscriptions enregistrées")
    Iterable<Subscription> getSubscriptions() {
        return subscriptionsRepository.findAll();
    }

    @DeleteMapping(value = {"/api/subscription"})
    @CrossOrigin
    @Operation(summary = "Supprime les souscriptions liées à un numéro de téléphone")
    void deleteSubscription(@RequestParam String mobileNumber) {
        Stream<Subscription> subscriptionsToDelete = StreamSupport.stream(subscriptionsRepository.findAll().spliterator(), false)
                .filter(it -> it.getMobile().equals(mobileNumber));

        subscriptionsRepository.deleteAll(subscriptionsToDelete.toList());
    }

    @PostMapping(value = {"/api/sendSMS"})
    @CrossOrigin
    @Operation(summary = "Envoie un SMS")
    String sensSMS(@RequestParam String mobileNumber, @RequestParam String message, @RequestParam String accessToken) throws SmsapiException {
        return smsSender.send(mobileNumber, message, accessToken).getList().get(0).getStatus();
    }
}
