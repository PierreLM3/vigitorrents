package com.vigitorrents.testtech.entities;

import org.springframework.data.annotation.Id;

public class Subscription {

    private @Id Integer id;
    private String nomTorrent;
    private String mobile;

    public Subscription(String nomTorrent, String mobile) {
        this.id = null;
        this.nomTorrent = nomTorrent;
        this.mobile = mobile;
    }

    public String getNomTorrent() {
        return nomTorrent;
    }
    public String getMobile() {
        return mobile;
    }

    @Override
    public String toString() {
        return "Subscription{" +
                "id=" + id +
                ", nomTorrent='" + nomTorrent + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}
