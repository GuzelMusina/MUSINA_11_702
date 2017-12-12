package ru.itis.transports;

import ru.itis.model.ParkingPlace;
import ru.itis.model.Transport;

/**
 * 26.10.2017
 * SportCar
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class SportCar extends Transport {

    private String model;
    private int number;

    public SportCar(int parkplace, ParkingPlace parkingPlace, String model, int number) {
        super(parkplace, parkingPlace);
        this.model = model;
        this.number = number;
    }

    @Override
    public String toString() {
        return model + " " + number;
    }


}
