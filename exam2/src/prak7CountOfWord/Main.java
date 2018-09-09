package prak7CountOfWord;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * 25.06.2018
 * Main
 *Практика 7
 Во входном файле представлен текст на английском языке. Он содержит слова, записанные через пробел, не содержащие в себе иных символов, кроме алфавита. Но слова могут быть записаны разным регистром.
 Создать Map, содержащий информацию о том, сколько раз каждое уникальное слово из файла встречается в нем. Map не должен зависеть от регистра слова, т.е. слова One, OnE, ONE и one - одно и то же слово.
 Содержимое полученного Map вывести на экран.
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader("text7.txt"));
        Map<String, Integer> map = new HashMap<>();
        String string = bf.readLine();
        String [] array = string.toLowerCase().split(" ");

        for(String word : array){
            if(!word.isEmpty()){
                Integer count = map.get(word);
                if ((count==null)){
                    count=0;
                }
                map.put(word, ++count);
            }
        }
        for(String word: map.keySet()){
            System.out.println(word + ":" + map.get(word));
        }
    }
}
