package ru.itis;

public class Main {

    public static void main(String[] args) {

        IntegerList list = new IntegerList();
        list.add(15);
        list.add(27);
        list.add(3);
        list.add(42);
        list.add(50);
        list.add(611);

        IntegerList mappedList = list.map(number -> {
            int sum = 0;
            if (number > 9) {
                while (number > 0) {
                    sum = sum + number % 10;
                    number = number / 10;
                }
                return sum;
            } else return number;
        });
        System.out.println("Convert number to sum of numbers: ");
        mappedList.printNumbers();

        IntegerList mappedList1 = list.filter(number ->
        {
            return number % 2 != 0;

        });
        System.out.println("Odd numbers is: ");
        mappedList1.printNumbers();

    }

}