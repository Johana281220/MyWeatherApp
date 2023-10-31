package org.sda.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.sda.model.Location;
import org.sda.model.WeatherData;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;
import java.util.UUID;

public class WeatherDataDaoImpl implements WeatherDataDao {

    private SessionFactory sessionFactory;
    public WeatherDataDaoImpl(SessionFactory sessionFactory){
        this.sessionFactory=sessionFactory;
    }

    @Override
    public WeatherData findById(UUID id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(WeatherData.class,id);
    }
    @Override
    public List<WeatherData> findByLocation(Location location) {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from WeatherData where location = :location", WeatherData.class).list();
    }

    @Override
    public void save(WeatherData weatherData) {
        Session session= sessionFactory.getCurrentSession();
        session.save(weatherData);
    }

    @Override
    public void update(WeatherData weatherData) {
        Session session= sessionFactory.getCurrentSession();
        session.update(weatherData);
    }

    @Override
    public void delete(WeatherData weatherData) {
        Session session= sessionFactory.getCurrentSession();
        session.delete(weatherData);

    }
}
