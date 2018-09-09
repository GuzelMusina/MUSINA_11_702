package prak15EvenOdComparato;

import java.util.Comparator;

/**
 * 25.06.2018
 * EvenOddComparator
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class EvenOddComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return oddEven(o1) - oddEven(o2);
    }

    public int oddEven(Integer n) {
        int odd = 0;
        int even = 0;
        int sub = 0;
        while (n > 0) {
            int temp = n % 10;
            if (temp / 2 == 0) {
                even++;
            } else {
                odd++;
            }
            n/=10;
        }
        return Math.abs(odd-even);
    }
}
