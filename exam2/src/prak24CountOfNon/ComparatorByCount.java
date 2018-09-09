package prak24CountOfNon;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

/**
 * 23.06.2018
 * ComparatorByCount
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class ComparatorByCount implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return checkCount(o1) - checkCount(o2);
    }

    public int checkCount(int count) {
        Set<Integer> set = new HashSet<>();
        while (count > 0) {

            set.add(count % 10);
            count = count / 10;
        }
        return set.size();
    }
}
