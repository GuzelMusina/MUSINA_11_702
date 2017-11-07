package ru.itis.transports;

import ru.itis.model.ParkingPlace;
import ru.itis.model.Transport;

/**
 * 26.10.2017
 * TracktorBelarus
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class TracktorBelarus extends Transport {

    private String model;
    private int countOfPotato;

    public TracktorBelarus(int parkplace, ParkingPlace parkingPlace, String model, int countOfPotato) {
        super(parkplace, parkingPlace);
        this.model = model;
        this.countOfPotato = countOfPotato;
    }

    @Override
    public String toString() {
        return model + " " + countOfPotato;
    }
}
