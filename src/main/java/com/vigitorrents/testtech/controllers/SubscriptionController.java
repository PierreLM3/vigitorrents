package com.vigitorrents.testtech.controllers;

import com.vigitorrents.testtech.entities.Subscription;
import com.vigitorrents.testtech.repositories.SubscriptionsRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.stream.Stream;
import java.util.stream.StreamSupport;

@RestController
@Tag(name = "Subscriptions")
public class SubscriptionController {

    @Autowired
    private SubscriptionsRepository subscriptionsRepository;

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
}
