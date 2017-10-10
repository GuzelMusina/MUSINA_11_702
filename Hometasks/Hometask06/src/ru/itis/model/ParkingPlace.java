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
    Car[] cars = new Car[10];
    public int countOfCar = 0;

    public ParkingPlace() {
    }

    public ParkingPlace(LocalTime begin, LocalTime finish) {
        this.begin = begin;
        this.finish = finish;
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
                ", cars=" + Arrays.toString(cars) +
                ", countOfCar=" + countOfCar +
                '}';
    }

    public void setBegin(LocalTime begin) {
        this.begin = begin;
    }

    public LocalTime getFinish() {
        return finish;
    }

    public void setFinish(LocalTime finish) {
        this.finish = finish;
    }

    public Car[] getCars() {
        return cars;
    }

    public void setCars(Car[] cars) {
        this.cars = cars;
    }

    public int getCountOfCar() {
        return countOfCar;
    }

    public void setCountOfCar(int countOfCar) {
        this.countOfCar = countOfCar;
    }

    public boolean parkingIsWorking() {
        if (LocalTime.now().isAfter(begin) &&
                LocalTime.now().isBefore(finish)) {
            return true;
        } else {
            return false;
        }
    }

    public void putCarOnParking(Car car) {
        if (parkingIsWorking() == true) {
            if (cars[car.getParkplace()] == null) {
                cars[car.getParkplace()] = car;
                countOfCar++;
            } else {
                System.err.println("The parkplace " + car.getParkplace() + " for " + car + " is not free");
            }
        } else {
            System.err.println("Parking close");
        }
    }

    public void deleteCarFromParking(Car car, int number) {
        if (car != null && parkingIsWorking() == true) {
            cars[number] = null;
        } else {
            System.err.println("Parking close");
        }
    }

    public void showCars() {
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
    }
}
