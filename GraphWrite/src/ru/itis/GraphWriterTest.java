package ru.itis;

import org.junit.Assert;
import org.junit.Test;

/**
 * 21.05.2018
 * GraphWriterTest
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class GraphWriterTest {
    private int[] answer;

    @Test
    public void test1(){
        int[] result = (new GraphWriter("input2.txt")).getGraph();
        answer = new int[12];
        answer[0] = 8;
        answer[1] = 10;
        answer[2] = -1;
        answer[3] = -1;
        answer[4] = -1;
        answer[5] = 11;
        answer[6] = -1;
        answer[7] = -1;
        answer[8] = 4;
        answer[9] = 3;
        answer[10] = 2;
        answer[11] = 7;
        for (int i = 0; i < answer.length; i++)
            Assert.assertEquals(answer[i], result[i]);
    }
}
