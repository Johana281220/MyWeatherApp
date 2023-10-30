package org.sda.service;

import org.hibernate.id.UUIDGenerationStrategy;
import org.sda.model.Location;

import java.util.List;
import java.util.UUID
public interface LocationService {
    public Location getLocationById(UUID id);
    public List<Location> getAllLocation(Location location);
    public void addLocation(Location location);
    public void  updateLocation(Location location);
    public void  deleteLocation(Location location);


    List<Location> getAllLocations();

}
