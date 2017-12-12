package ru.itis;

import ru.itis.transports.*;
import ru.itis.model.ParkingPlace;

import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {

        LocalTime beginTime = LocalTime.parse("08:00:00");
        LocalTime finishTime = LocalTime.parse("23:00:00");

        ParkingPlace parkingPlace = new ParkingPlace(beginTime,finishTime);

        Car car = new Car(3,parkingPlace,"BMW",111);
        Plane plane = new Plane(4, parkingPlace, "Boing", 424);
        SportCar sportCar = new SportCar(2, parkingPlace, "Nissan", 212);
        Tank tank = new Tank(6, parkingPlace, "Tiger", "VERY POWERFULL");
        TracktorBelarus tracktorBelarus = new TracktorBelarus(9, parkingPlace, "Belarus", 3684);

        car.goOnParking();
        plane.goOnParking();
        sportCar.goOnParking();
        parkingPlace.putCarOnParking(tank);
        parkingPlace.putCarOnParking(tracktorBelarus);

        parkingPlace.showTransports();
    }
}
