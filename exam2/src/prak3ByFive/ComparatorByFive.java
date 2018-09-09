package prak3ByFive;

import java.util.Comparator;

/**
 * 25.06.2018
 * ComparatorByFive
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class ComparatorByFive implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        int count1 = countOfFive(o1);
        int count2 = countOfFive(o2);

        if(count1>count2){
            return 1;
        }else if(count1<count2){
            return -1;
        }else{
            return 0;
        }
    }

    public int countOfFive(Integer n){
        int count = 0;
        while (n>0){
            if(n%10 == 5){
                count++;
            }
            n/=10;
        }
        return count;
    }
}
