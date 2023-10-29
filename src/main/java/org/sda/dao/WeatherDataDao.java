package org.sda.dao;

import org.sda.model.Location;
import org.sda.model.WeatherData;

import java.util.List;
import java.util.UUID;

public interface WeatherDataDao {
    public WeatherData findById(UUID id);
    public List<WeatherData> findByLocation(Location location);
    public void save(WeatherData weatherData);
    public void update(WeatherData weatherData);
    public  void delete(WeatherData weatherData);




}
