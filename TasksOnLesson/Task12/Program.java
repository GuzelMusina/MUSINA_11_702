package Task12;

import java.util.Scanner;

/**
 * 19.09.2017
 * Program
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class Program {

    public static double function(double x) {
        return Math.sin(1 / x);
    }

    public static double integrate(double a, double b, double h) {

        double result = 0;


        for (double i = a; i <= b; i += h) {
            if (i != 0) {
                result = result + h * function(i);
            }

        }
        return result;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double n = scanner.nextDouble();

        double h = Math.abs((b - a) / n);

        double result = integrate(a, b, h);

        System.out.println(result);

    }
}
