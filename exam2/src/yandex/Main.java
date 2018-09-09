package yandex;

import java.io.*;
import java.util.ArrayList;

/**
 * 25.06.2018
 * Main
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader("in3.txt"));
        String s = bf.readLine();
        Data data = new Data(s);

        bf.close();
        ArrayList<Data> arrayList = new ArrayList<>();
        arrayList.add(data);

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("out3.txt"));
        bufferedWriter.write(arrayList.get(0).getName().toString() + " ");
        int n = arrayList.get(0).middleUsers();
        bufferedWriter.write(Integer.toString(n));
        bufferedWriter.close();
    }
}
