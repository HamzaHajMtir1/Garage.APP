package com.garage.app.Garage.APP.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.garage.app.Garage.APP.model.Car;
import com.garage.app.Garage.APP.repository.GarageRepository;

import java.util.ArrayList;

@Service
public class GarageService {

    @Autowired
    private GarageRepository garageRepository;
    
    public ArrayList<Car> getCar() {
        ArrayList<Car> cars = new ArrayList<>();
        garageRepository.findAll().forEach(Car ->{
            cars.add(Car);
        });
        return cars;
    }

    public Car getCar(long id) {
        return garageRepository.findById(id).orElse(null);
    }

    public void delete(long id) {
        garageRepository.deleteById(id);
    }

    @SuppressWarnings("null")
    public void add(Car car) {
        garageRepository.save(car);
    }

    @SuppressWarnings("null")
    public void update(Car car, long id) {
        garageRepository.save(car);
    }
}
