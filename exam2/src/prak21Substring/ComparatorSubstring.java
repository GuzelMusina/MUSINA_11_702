package prak21Substring;

import java.util.Comparator;

/**
 * 24.06.2018
 * ComparatorSubstring
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class ComparatorSubstring implements Comparator<String> {


    @Override
    public int compare(String o1, String o2) {
        int count1 = countOfSubstring(o1);
        int count2 = countOfSubstring(o2);

        if (count1 > count2) {
            return 1;
        } else if (count1 < count2) {
            return -1;
        } else {
            return 0;
        }
    }

    public int countOfSubstring(String string) {

        int length = 1;
        int max = length;
        char[] chars = string.toCharArray();
        for (int i = 0; i < chars.length - 1; i++) {
            if (((chars[i] - chars[i + 1])) == -1 || ((chars[i] - chars[i + 1])) == 0 ) {
                length++;
                if (length > max) {
                    max = length;
                }
            } else {
                length = 1;
            }

        }
        return max;
    }

}
