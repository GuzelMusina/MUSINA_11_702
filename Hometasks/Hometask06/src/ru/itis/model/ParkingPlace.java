package ru.itis.model;

import java.time.LocalTime;
import java.util.Arrays;

/**
 * 03.10.2017
 * ParkingPlace
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class ParkingPlace {

    private LocalTime begin;
    private LocalTime finish;
    private Transport[] transports;
    private int countOfTransports = 0;
    private final int COUNT_OF_PARKINGPLACE = 10;

    public ParkingPlace() {
    }

    public ParkingPlace(LocalTime begin, LocalTime finish) {
        this.begin = begin;
        this.finish = finish;
        this.transports = new Transport[COUNT_OF_PARKINGPLACE];
    }

    /*public ParkingPlace(LocalTime begin, LocalTime finish, Car[] cars) {
        this.begin = begin;
        this.finish = finish;
        this.cars = cars;
    }*/

    public LocalTime getBegin() {
        return begin;
    }

    @Override
    public String toString() {
        return "ParkingPlace{" +
                "begin=" + begin +
                ", finish=" + finish +
                ", cars=" + Arrays.toString(transports) +
                ", countOfTransports=" + countOfTransports +
                '}';
    }

    public LocalTime getFinish() {
        return finish;
    }

    public Transport[] getTransports() {
        return transports;
    }

    public int getCountOfTransports() {
        return countOfTransports;
    }

    public int getCOUNT_OF_PARKINGPLACE() {
        return COUNT_OF_PARKINGPLACE;
    }

    public boolean parkingIsWorking() {
        if (LocalTime.now().isAfter(begin) &&
                LocalTime.now().isBefore(finish)) {
            return true;
        } else {
            return false;
        }
    }

    public void putCarOnParking(Transport transport) {
        if (parkingIsWorking() == true) {
            if ((transports[transport.getParkplace()] == null) && (countOfTransports < COUNT_OF_PARKINGPLACE)) {
                transports[transport.getParkplace()] = transport;
                countOfTransports++;
            } else {
                System.err.println("The parkplace " + transport.getParkplace() + " for " + transport + " is not free");
            }
        } else {
            System.err.println("Parking close");
        }
    }

    public void deleteCarFromParking(Transport transport) {
        if ((transport != null) && (parkingIsWorking() == true) && (countOfTransports < COUNT_OF_PARKINGPLACE)) {
            transports[transport.getParkplace()] = null;
        } else {
            System.err.println("Parking close");
        }
    }

    public void showTransports() {
        for (int i = 0; i < transports.length; i++) {
            System.out.println(transports[i]);
        }
    }
}
