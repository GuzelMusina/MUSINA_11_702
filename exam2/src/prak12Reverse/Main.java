package prak12Reverse;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * 23.06.2018
 * Main
 * Сортирую по развернутым числам
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        while (n!=-1){
            list.add(n);
            n= scanner.nextInt();
        }

        Collections.sort(list,new ComparatorForNumbers());
        System.out.println(list.toString());
    }
}
