package ru.itis.transports;

import ru.itis.model.ParkingPlace;
import ru.itis.model.Transport;

/**
 * 26.10.2017
 * Plane
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class Plane extends Transport {

    private String model;
    private int counOfPassengers;

    public Plane(int parkplace, ParkingPlace parkingPlace, String model, int counOfPassengers) {
        super(parkplace, parkingPlace);
        this.model = model;
        this.counOfPassengers = counOfPassengers;
    }

    @Override
    public String toString() {
        return model + " " + counOfPassengers;
    }

}
