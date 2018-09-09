package prak8CountOfChar;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * 25.06.2018
 * Main
 * Практика 8
 * На вход программы подается файл с английским текстом.
 * Составить статистику с помощью Map<Character, Integer> о том,
 * сколько раз каждая буква английского алфавита упоминается в тексте.
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader("text7.txt"));
        String string = bf.readLine();
        char[] chars = string.toCharArray();
        for (int j = 0; j < chars.length; j++) {
            char letter = string.charAt(j);
            HashMap<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < chars.length; i++) {
                char c = chars[i];
                if (Character.isLetter(c)) {
                    if (map.containsKey(c)) {
                        map.put(c, map.get(c) + 1);
                    } else {
                        map.put(c, 1);
                    }
                }
            }
            if (map.get(letter) == null) {

            } else {
                System.out.println("Число повтров буквы " + letter + " - " + map.get(letter));
            }
        }
    }
}
