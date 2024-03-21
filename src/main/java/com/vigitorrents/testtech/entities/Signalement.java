package com.vigitorrents.testtech.entities;

import org.springframework.data.annotation.Id;

public class Signalement {

    private @Id Integer id;

    private final String nomTorrent;
    private final Double latitude;
    private final Double longitude;
    private final String hauteur;
    private final String vitesse;
    private final String transport;
    private final String clarte;
    private final String commentaire;

    private final String heure;
    private final String evenement;
    private final String media;

    public Signalement(String nomTorrent,
                       Double latitude,
                       Double longitude,
                       String hauteur,
                       String vitesse,
                       String transport,
                       String clarte,
                       String commentaire,
                       String heure,
                       String evenement,
                       String media) {
        this.id = null;
        this.nomTorrent = nomTorrent;
        this.latitude = latitude;
        this.longitude = longitude;
        this.hauteur = hauteur;
        this.vitesse = vitesse;
        this.transport = transport;
        this.clarte = clarte;
        this.commentaire = commentaire;
        this.heure = heure;
        this.evenement = evenement;
        this.media = media;
    }

    public Integer getId() {
        return id;
    }

    public String getNomTorrent() {
        return nomTorrent;
    }

    public Double getLatitude() {
        return latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public String getHauteur() {
        return hauteur;
    }

    public String getVitesse() {
        return vitesse;
    }

    public String getTransport() {
        return transport;
    }

    public String getClarte() {
        return clarte;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public String getHeure() {
        return heure;
    }

    public String getEvenement() {
        return evenement;
    }

    public String getMedia() {
        return media;
    }

    @Override
    public String toString() {
        return "Signalement{" +
                "id=" + id +
                ", nomTorrent='" + nomTorrent + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", hauteur='" + hauteur + '\'' +
                ", vitesse='" + vitesse + '\'' +
                ", transport='" + transport + '\'' +
                ", clarte='" + clarte + '\'' +
                ", commentaire='" + commentaire + '\'' +
                ", heure='" + heure + '\'' +
                ", evenement='" + evenement + '\'' +
                ", media='" + media + '\'' +
                '}';
    }
}
