package ru.itis;

import ru.itis.model.Car;
import ru.itis.model.ParkingPlace;

import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {

        LocalTime beginTime = LocalTime.parse("08:00:00");
        LocalTime finishTime = LocalTime.parse("23:00:00");

        ParkingPlace parkingPlace = new ParkingPlace(beginTime,finishTime);

        Car car1 = new Car("Audi", 756, 2,parkingPlace);
        Car car2 = new Car ("Ford", 111, 5,parkingPlace);
        Car car3 = new Car("Nissan", 777, 7, parkingPlace);

        parkingPlace.putCarOnParking(car1);
       // car2.goOnParking(car2);
        car3.goOnParking(car3);

        //car1.goOutParking(car1);
        parkingPlace.showCars();


    }
}
