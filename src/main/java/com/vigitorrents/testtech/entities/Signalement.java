package com.vigitorrents.testtech.entities;

import org.springframework.data.annotation.Id;

import java.util.Random;

public class Signalement {

    private @Id Integer id;

    private String nomTorrent;
    private Double latitude;
    private Double longitude;
    private String hauteur;
    private String vitesse;
    private String transport;
    private String clarte;
    private String commentaire;

    public Signalement(String nomTorrent, Double latitude, Double longitude, String hauteur, String vitesse, String transport, String clarte, String commentaire) {
        this.id = null;
        this.nomTorrent = nomTorrent;
        this.latitude = latitude;
        this.longitude = longitude;
        this.hauteur = hauteur;
        this.vitesse = vitesse;
        this.transport = transport;
        this.clarte = clarte;
        this.commentaire = commentaire;
    }

    public Integer getId() {
        return id;
    }

    public String getNomTorrent() {
        return nomTorrent;
    }

    public void setNomTorrent(String nomTorrent) {
        this.nomTorrent = nomTorrent;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public String getHauteur() {
        return hauteur;
    }

    public void setHauteur(String hauteur) {
        this.hauteur = hauteur;
    }

    public String getVitesse() {
        return vitesse;
    }

    public void setVitesse(String vitesse) {
        this.vitesse = vitesse;
    }

    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    public String getClarte() {
        return clarte;
    }

    public void setClarte(String clarte) {
        this.clarte = clarte;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
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
                '}';
    }
}
