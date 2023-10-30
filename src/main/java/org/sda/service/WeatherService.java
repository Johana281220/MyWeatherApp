package org.sda.service;

import org.sda.model.Location;
import org.sda.model.WeatherData;

import java.util.List;
import java.util.UUID;

public interface WeatherService {
    WeatherData getWeatherDataById(UUID id);

    List<WeatherData> getWeatherDataForLocation(Location location);

    void addWeatherData(WeatherData weatherData);

    void updateWeatherData(WeatherData weatherData);

    void deleteWeatherData(WeatherData weatherData);
}
