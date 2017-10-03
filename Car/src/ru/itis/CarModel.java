package ru.itis;

/**
 * 03.10.2017
 * CarModel
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class CarModel {

    public CarModel() {
    }

    public CarModel(String model, int number, int power, String colour) {
        setModel(model);
        setNumber(number);
        setPower(power);
        setColour(colour);
    }


    public CarModel(String model, int power) {
        this.model = model;
        this.power = power;
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

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        if (power >= 0) {
            this.power = power;
        } else {
            System.err.println("Неправильный номер, задано по умолчанию");
            this.power = 0;
        }
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        if (mileage >= 0) {
            this.mileage = mileage;
        } else {
            System.err.println("Неправильный номер, задано по умолчанию");
            this.mileage = 0;
        }
    }

    public void mileageUp(int n) {
        if (n != 0) {
            mileage = mileage + n;
        } else {
            System.err.println("Number is incorrect");
        }
    }

    private String model;
    private int number;
    private int power;
    private String colour;
    private int mileage;

    @Override
    public String toString() {
        return "CarModel{" +
                "model='" + model + '\'' +
                ", number=" + number +
                ", power=" + power +
                ", colour='" + colour + '\'' +
                ", mileage=" + mileage +
                '}';
    }
}
