package ru.itis;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * 02.05.2018
 * TreeTest
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class TreeTest {

    private String string;

    @Before
    public void setUp(){
       string = new String();
    }

    @Test
    public void test1(){
        string = "(3+(5*4))";
        ParseTree parseTree = new ParseTree();
        parseTree.insert(string);
        int wait = 23;
        Assert.assertEquals(wait, parseTree.evaluate());
    }

    @Test
    public void test2(){
        string = "(9+8)";
        ParseTree parseTree = new ParseTree();
        parseTree.insert(string);
        int wait = 17;
        Assert.assertEquals(wait, parseTree.evaluate());
    }
    @Test
    public void test3(){
        string = "(9-(2*2))";
        ParseTree parseTree = new ParseTree();
        parseTree.insert(string);
        int wait = 5;
        Assert.assertEquals(wait, parseTree.evaluate());
    }

    @Test
    public void test4(){
        string = "(8/(2*2))";
        ParseTree parseTree = new ParseTree();
        parseTree.insert(string);
        int wait = 2;
        Assert.assertEquals(wait, parseTree.evaluate());
    }
}
