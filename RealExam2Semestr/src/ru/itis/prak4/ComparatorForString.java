package ru.itis.prak4;

import java.util.Comparator;

/**
 * 26.06.2018
 * ComparatorForString
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class ComparatorForString implements Comparator<String> {

    private int i;

    public ComparatorForString(int i) {
        this.i = i;
    }

    @Override
    public int compare(String o1, String o2) {
        return o1.charAt(i) - sortStrings(o2);
        /*
        Можно конечно было сделать:
        char c1 = sortString(o1);
        char c2 = sortString(o2);
        if(c1>c2){
            return 1;
        }else if(c1<c2){
            return -1;
        }else{
            return 0
        }
        */
    }

    public char sortStrings(String s){
        char[] chars = s.toCharArray();
        char result = chars[i];
        return result;
    }
}
