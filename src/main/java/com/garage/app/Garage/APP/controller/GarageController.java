package com.garage.app.Garage.APP.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.garage.app.Garage.APP.model.Car;
import com.garage.app.Garage.APP.service.GarageService;
import java.util.ArrayList;

@CrossOrigin(origins = "*")
@RestController
public class GarageController {

    @Autowired
    private GarageService garageService;

    @RequestMapping(method = RequestMethod.GET , value =  "/cars") // la même chause c'est GEt par defaut
    public ArrayList<Car> getCar() {
        return garageService.getCar();
    }

    @RequestMapping("/car/{id}")
    public Car getCar(@PathVariable long id) {
        return garageService.getCar(id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/del-car/{id}")
    public void deleteCar(@PathVariable long id) {
        garageService.delete(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/add-car")
    public void addCar(@RequestBody Car car) {
        garageService.add(car);
    }

    @RequestMapping(method=RequestMethod.PUT, value = "upd-car/{id}")
    public void updateCar(@RequestBody Car car, @PathVariable long id) {
        garageService.update(car, id);
    }
}
