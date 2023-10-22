package org.sda.model;

import javax.persistence.*;
import java.util.UUID;
@Entity
@Table(name = "location")

public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private UUID id;
    private double latitude;
    private double lognitude;
    private String region;
    private String country;


    public Location(UUID id, double latitude, double lognitudie, String region, String country) {
        this.id = id;
        this.latitude = latitude;
        this.lognitude = lognitudie;
        this.region = region;
        this.country = country;
    }

    public Location() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLognitude() {
        return lognitude;
    }

    public void setLognitude(double lognitude) {
        this.lognitude = lognitude;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Location{" +
                "id=" + id +
                ", latitude=" + latitude +
                ", lognitude=" + lognitude +
                ", region='" + region + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}

