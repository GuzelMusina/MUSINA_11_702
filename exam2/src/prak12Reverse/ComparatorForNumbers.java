package prak12Reverse;

import java.util.Comparator;

/**
 * 23.06.2018
 * ComparatorForNumbers
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class ComparatorForNumbers implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        int count1 = reverseNumber(o1);
        int count2 = reverseNumber(o2);
        if(count1>count2){
            return 1;
        }else if(count1<count2){
            return -1;
        }else {
            return 0;
        }

    }

    public int reverseNumber(Integer n){
        int result=0;
        while (n>0){
            result = result*10 + n%10;
            n/=10;
        }
        return result;
    }
}
