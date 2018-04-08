package ru.itis;

import jdk.nashorn.internal.runtime.regexp.joni.exception.SyntaxException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * 04.04.2018
 * TreeTest
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class TreeTest {
    private TreeBstImpl treeTest;
    private int array[] = {5, 4, 8, 2, 5, 6, 10, 3, 6, 7, 4};





    @Before
    public void setUp(){
        treeTest = new TreeBstImpl();
        for (int i = 0; i < array.length; i++) {
            treeTest.insert(array[i]);
        }
    }

    @Test
    public void testTree1(){
        boolean result = treeTest.contains(4);
        Assert.assertTrue(result);
    }
    @Test
    public void testTree2(){
        boolean result = treeTest.contains(2);
        Assert.assertTrue(result);
    }
    @Test
    public void testTree3(){
        boolean result = treeTest.contains(8);
        Assert.assertTrue(result);
    }
    @Test
    public void testTree4(){
        boolean result = treeTest.contains(5);
        Assert.assertTrue(result);
    }
    @Test
    public void testTree5(){
        String result = "2 3 4 4 5 5 6 6 7 8 10 ";
       for (Integer number : array){
           Assert.assertTrue(treeTest.contains(number));
       }
    }
    @Test
    public void testTree6(){
        Assert.assertTrue(treeTest.isBst());
    }
}
