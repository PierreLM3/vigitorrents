package com.vigitorrents.testtech.controllers;


import com.vigitorrents.testtech.entities.Signalement;
import com.vigitorrents.testtech.repositories.SignalementsRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Tag(name = "Signalements")
public class SignalementController {

    @Autowired
    private SignalementsRepository signalementsRepository;

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
}
