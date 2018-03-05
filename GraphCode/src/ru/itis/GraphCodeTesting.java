package ru.itis;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * 01.03.2018
 * GraphCodeTesting
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class GraphCodeTesting {

    private GraphCode testableGraphCode;
    private int[][] mi = {
            {1, 1, 0},
            {1, 0, 1},
            {0, 1, 1}
    };

    @Before
    public void setUp() {
        testableGraphCode = new GraphCode();
    }

    @Test
    public void testAdd() {
        String expected = "0 1,";
        testableGraphCode.add(0, 1);
        String actual = testableGraphCode.toString();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGraphToMatrix() {
        String expected = "0 0,1 0,2 1,2 2,";
        testableGraphCode.graphToMatrix(mi);
        String actual = testableGraphCode.toString();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetMi() {
        testableGraphCode.add(0, 1);
        testableGraphCode.add(0, 2);
        testableGraphCode.add(1, 2);
        int[][] expected = testableGraphCode.getMi();
        Assert.assertEquals(mi, expected);

    }

    @Test
    public void testDelete() {
        String expected = "0 0,2 1,2 2,";
        testableGraphCode.graphToMatrix(mi);
        testableGraphCode.delete(1, 0);
        String actual = testableGraphCode.toString();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetAdjacent() {
        String expected = "0 0,1 0,";
        testableGraphCode.graphToMatrix(mi);
        String actual = testableGraphCode.getAdjacent(0).toString();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testShow() {
        String expected = "[0, 1, 2]";
        testableGraphCode.graphToMatrix(mi);
        String actual = testableGraphCode.show(2).toString();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testModify() {
        String expected = "0 0,2 2,";
        testableGraphCode.graphToMatrix(mi);
        testableGraphCode.modify(1);
        String actual = testableGraphCode.toString();
        Assert.assertEquals(expected,actual);
    }

}
