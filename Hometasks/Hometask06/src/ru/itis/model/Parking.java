package ru.itis.model;

import java.time.LocalTime;

/**
 * 03.10.2017
 * Parking
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class Parking {

    public LocalTime begin;
    public LocalTime finish;
    public int allCars[];
    public int countOfCar;
    public int[] parkplace;

    public int[] getParkplace() {
        return parkplace;
    }

    public void setParkplace(int parkplace) {
        this.parkplace[parkplace] = parkplace;
    }

    public Parking() {

    }

    public Parking(LocalTime begin, LocalTime finish) {
        this.begin = begin;
        this.finish = finish;
    }

    public LocalTime getBegin() {
        return begin;
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

    public int[] getAllCars() {
        return allCars;
    }

    public void setAllCars(int[] allCars) {
        this.allCars = allCars;
    }

    public int getCountOfCar() {
        return countOfCar;

    }

    public void setCountOfCar(int countOfCar) {
        this.countOfCar = countOfCar;
    }


    public boolean parkingIsWorking(LocalTime begin, LocalTime finish) {
        if (LocalTime.now().isAfter(begin) &&
                LocalTime.now().isBefore(finish)) {
            return true;
        } else {
            return false;
        }
    }

    public void putCar(Car car) {
        if (car != null) {
            allCars[countOfCar] = car.getParkPlace();
            countOfCar++;
        } else {
            System.out.println("Car is not real");
        }
    }

    public void deleteCarFromParking(Car car, int number) {
        if (car != null) {
            for (int i = number; i < allCars.length - 1; i++) {
                allCars[i] = allCars[i + 1];
            }
        }
    }

}
