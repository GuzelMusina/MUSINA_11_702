package ru.itis.transports;

import ru.itis.model.ParkingPlace;
import ru.itis.model.Transport;

/**
 * 26.10.2017
 * Tank
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class Tank extends Transport {

    private String model;
    private String power;

    public Tank(int parkplace, ParkingPlace parkingPlace, String model, String power) {
        super(parkplace, parkingPlace);
        this.model = model;
        this.power = power;
    }

    @Override
    public String toString() {
        return model + " " + power;
    }
}
