package ru.itis.model;

/**
 * 03.10.2017
 * Car
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class Car {

    private String model;
    private int number;
    private int parkplace;
    private ParkingPlace parkingPlace;


    public Car(String model, int number, int parkplace, ParkingPlace parkingPlace) {
        setModel(model);
        setNumber(number);
        setParkplace(parkplace);
        setParkingPlace(parkingPlace);

    }

    public Car() {

    }

    public ParkingPlace getParkingPlace() {
        return parkingPlace;
    }

    public void setParkingPlace(ParkingPlace parkingPlace) {
        this.parkingPlace = parkingPlace;
    }

    public int getParkplace() {
        return parkplace;
    }

    public void setParkplace(int parkplace) {
        this.parkplace = parkplace;

    }

    public String getModel() {
        return model;

    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        if (number >= 0) {
            this.number = number;
        } else {
            System.err.println("Number is incorrect, set by default");
            this.number = 0;
        }
    }

    @Override
    public String toString() {
        return model + " " + number;
    }


    public void goOnParking(Car car) {
        if (car != null) {
            parkingPlace.putCarOnParking(car);
        }
    }

    public void goOutParking(Car car) {
        if (car != null) {
            parkingPlace.deleteCarFromParking(car, parkingPlace.getCountOfCar());
        }
    }

}

