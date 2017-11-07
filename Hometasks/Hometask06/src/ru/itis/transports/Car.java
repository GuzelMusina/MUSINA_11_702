package ru.itis.transports;

import ru.itis.model.ParkingPlace;
import ru.itis.model.Transport;

/**
 * 03.10.2017
 * Car
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class Car extends Transport {

    public Car(int parkplace, ParkingPlace parkingPlace, String model, int number) {
        super(parkplace, parkingPlace);
        this.model = model;
        this.number = number;
    }

    private String model;
    private int number;

    @Override
    public String toString() {
        return model + " " + number;
    }


}

