package ru.itis.model;

/**
 * 26.10.2017
 * Transport
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class Transport {

    private int parkplace;
    private ParkingPlace parkingPlace;

    public Transport(int parkplace, ParkingPlace parkingPlace) {
        this.parkplace = parkplace;
        this.parkingPlace = parkingPlace;
    }

    public int getParkplace() {
        return parkplace;
    }

    public ParkingPlace getParkingPlace() {
        return parkingPlace;
    }

    public void goOnParking() {
        parkingPlace.putCarOnParking(this);

    }

    public void goOutParking() {
        parkingPlace.deleteCarFromParking(this);
    }

}
