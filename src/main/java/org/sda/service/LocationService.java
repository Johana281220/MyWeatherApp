package org.sda.service;

import org.hibernate.id.UUIDGenerationStrategy;
import org.sda.model.Location;

import java.util.List;
import java.util.UUID;

//Service interface si LocationService përfaqëson business logic të nivelit të lartë ose operacionet
//specifike të aplikacionit që lidhen me një domain të caktuar, siç është vendndodhja në kete rast
//Përmbledh logjikën e biznesit, vërtetimin dhe koordinimin midis operacioneve të shumëfishta të
//aksesit të të dhënave.
//Mund të përdorë një ose më shumë objekte të aksesit të të dhënave (DAO) për të bashkëvepruar me
//burimin themelor të të dhënave (p.sh., një bazë të dhënash).
public interface LocationService {
    public Location getLocationById(UUID id);
    public List<Location> getAllLocation(Location location);
    public void addLocation(Location location);
    public void  updateLocation(Location location);
    public void  deleteLocation(Location location);


    List<Location> getAllLocations();

}
