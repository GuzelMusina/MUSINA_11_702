package ru.itis;

public class Main {

    public static void main(String[] args) {

        CarModel carModel1 = new CarModel("Audi", 125, 78, "black");
        carModel1.setMileage(6);
        CarModel carModel2 = new CarModel("BMW", 567);

        System.out.println(carModel2);
        System.out.println(carModel1.getMileage());

        carModel1.mileageUp(10);
        System.out.println(carModel1.getMileage());
    }
}
