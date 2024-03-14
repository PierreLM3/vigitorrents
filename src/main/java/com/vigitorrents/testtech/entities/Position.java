package com.vigitorrents.testtech.entities;

public class Position {

    private final Double latitude;
    private final Double longitude;

    public Position(Double latitude, Double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public Double getLongitude() {
        return longitude;
    }
}
