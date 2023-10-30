package org.sda.model;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name= "weather_data")
public class WeatherData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Date;
    private double temperature;
    private double humidity;
    private double pressure;
    private double windSpeed;
    private String windDirection;



    public WeatherData(int date, double temperature,
                       double humidity, double pressure,
                       double windspeed, String windDirection) {
        Date = date;
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.windSpeed = windspeed;
        this.windDirection = windDirection;
    }

    public WeatherData() {
    }

    public int getDate() {
        return Date;
    }

    public void setDate(int date) {
        Date = date;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public double getWindspeed() {
        return windSpeed;
    }

    public void setWindspeed(double windspeed) {
        this.windSpeed = windspeed;
    }

    public String getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(String windDirection) {
        this.windDirection = windDirection;
    }

    @Override
    public String toString() {
        return "WeatherData{" +
                "Date=" + Date +
                ", temperature=" + temperature +
                ", humidity=" + humidity +
                ", pressure=" + pressure +
                ", windspeed=" + windSpeed +
                ", windDirection='" + windDirection + '\'' +
                '}';
    }

    public void setWindSpeed(double windSpeed) {

    }
}
