package com.example.ws;

import javax.jws.WebService;

@WebService(endpointInterface = "com.example.ws.CarService")
public class CarServiceImpl implements CarService {

    /**
     * TODO: create list of cars
     * private List<Car> cars = new ArrayList<>(Arrays.asList(
            new Car(......),
            new Car(......)));
     */

    @Override
    public Car getCar(String plateNumber) {
        /*TODO: add your implementation here*/
        return null;
    }

    @Override
    public boolean rentCar(String plateNumber) {
        /*TODO: add your implementation here*/
        return false;
    }

    @Override
    public boolean getBackCar(String plateNumber) {
        /*TODO: add your implementation here*/
        return false;
    }
}

