package com.vigitorrents.testtech.entities;

import org.springframework.data.annotation.Id;

public class Subscription {

    private final @Id Integer id;
    private String nomTorrent;
    private String mobile;

    public Subscription(Integer id, String nomTorrent, String mobile) {
        this.id = id;
        this.nomTorrent = nomTorrent;
        this.mobile = mobile;
    }

    public String getNomTorrent() {
        return nomTorrent;
    }

    public void setNomTorrent(String nomTorrent) {
        this.nomTorrent = nomTorrent;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "Subscription{" +
                "nomTorrent='" + nomTorrent + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}
