package org.sda.consoleApp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.sda.dao.LocationDao;
import org.sda.dao.LocationImpl;
import org.sda.dao.WeatherDataDao;
import org.sda.dao.WeatherDataImpl;
import org.sda.model.Location;
import org.sda.model.WeatherData;
import org.sda.service.LocationService;
import org.sda.service.LocationServiceImpl;
import org.sda.service.WeatherDataService;
import org.sda.service.WeatherServiceImpl;
import org.sda.util.HibernateUtil;

import javax.swing.*;
import java.util.List;
import java.util.UUID;

public class WeatherDataGui {
  private JFrame frame;
  private LocationService locationService;
  private WeatherDataService weatherDataService;

    public WeatherDataGui() {
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();

        LocationDao locationDao= new LocationImpl(factory);
         locationService = new LocationServiceImpl(locationDao);

         WeatherDataDao weatherDataDao= new WeatherDataImpl(factory);
         weatherDataService = new WeatherServiceImpl(weatherDataDao);



    }

}



