package ru.itis;

import ru.itis.model.Car;
import ru.itis.model.Parking;

import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {

        LocalTime beginTime = LocalTime.parse("14:00:00");
        LocalTime finishTime = LocalTime.parse("15:00:00");

        Parking parking = new Parking(beginTime,finishTime);

        Car car1 = new Car("Audi", 756, 2);
        Car car2 = new Car ("Ford", 111, 5);

        car1.goOnParking(parking,car1);
        System.out.println(parking.getAllCars());
    }
}
