package com.garage.app.Garage.APP.repository;

import org.springframework.data.repository.CrudRepository;

import com.garage.app.Garage.APP.model.Car;

public interface GarageRepository extends CrudRepository<Car, Long>{

}