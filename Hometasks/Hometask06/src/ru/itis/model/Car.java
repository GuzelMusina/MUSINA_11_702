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


    public Car(String model, int number,int parkplace) {
        this.model = model;
        this.number = number;

        this.parkplace = parkplace;
    }

    public int getParkPlace() {
        return parkplace;
    }

    public void setParkPlace(Parking parkplace) {
        parkplace.setParkplace(this.parkplace);
    }


    public Car() {

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
            System.err.println("Неправильный номер, задано по умолчанию");
            this.number = 0;
        }
    }

    @Override
    public String toString() {
        return "model" + model +
                "number" + number;
    }


    public void goOnParking(Parking parking, Car car) {
        if (car != null) {
            parking.putCar(car);
        }
    }

    public void goOutParking(Parking parking, Car car) {
        if (car != null) {
            parking.deleteCarFromParking(car, parking.getCountOfCar());
        }
    }

}
