package ru.itis;

import org.junit.Before;
import org.junit.Test;

/**
 * 12.03.2018
 * QuickSortTester
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class QuickSortTester {
    private QuickSort sort;
    int []array = new int[]{235,
            10, 12, 655, 201,
            976, 250, 266, 993, 133, 976, 512,
            294, 530, 491, 168, 979,561, 891};


    @Before
    public void setUp() {
    sort = new QuickSort(array);
    }

    @Test(expected = IllegalAccessError.class)
    public void test1() {
        sort.sort(0,array.length-1);
    }
}
