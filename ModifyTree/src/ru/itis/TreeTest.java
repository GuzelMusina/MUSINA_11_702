package ru.itis;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 10.04.2018
 * TreeTest
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class TreeTest {

    private Tree treeTest;
    private Scanner scanner;

    @Before
    public void setUp() throws FileNotFoundException {
        treeTest = new Tree();
        scanner = new Scanner(new FileInputStream("input.txt"));

    }

    @Test
    public void test1() {
        int input = 3;
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] array = new int[n - 1];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        Tree tree = new Tree(n, k, array);
        Assert.assertEquals(tree.modify(), input);
    }

    @Test
    public void test2() {
        int input = 0;
        int n = 12;
        int k = 3;
        int[] array = {0, 0, 0, 1, 1, 1, 2, 2, 3, 5, 5};
        Tree tree = new Tree(n, k, array);
        Assert.assertEquals(tree.modify(), input);
    }

    @Test
    public void test3() {
        int input = 4;
        int n = 12;
        int k = 2;
        int[] array = {0, 0, 0, 1, 1, 1, 2, 2, 3, 5, 5};
        Tree tree = new Tree(n, k, array);
        Assert.assertEquals(tree.modify(), input);
    }

    @Test
    public void test4() {
        int input = 2;
        int n = 13;
        int k = 3;
        int[] array = {0, 0, 0, 1, 1, 1, 2, 2, 3, 5, 5, 1};
        Tree tree = new Tree(n, k, array);
        Assert.assertEquals(tree.modify(), input);
    }

    @Test
    public void test6() {
        int input = 2;
        int n = 13;
        int k = 3;
        int[] array = {0, 0, 0, 0, 1, 1, 1, 2, 2, 3, 5, 5};
        Tree tree = new Tree(n, k, array);
        Assert.assertEquals(tree.modify(), input);
    }

    @Test
    public void test7() {
        int input = 2;
        int n = 17;
        int k = 4;
        int[] array = {0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 3, 5, 5};
        Tree tree = new Tree(n, k, array);
        Assert.assertEquals(tree.modify(), input);
    }

    @Test
    public void test8() {
        int input = 4;
        int n = 17;
        int k = 3;
        int[] array = {0, 0, 0, 1, 1, 1, 2, 2, 3, 5, 5, 1, 2, 2, 3, 4};
        Tree tree = new Tree(n, k, array);
        Assert.assertEquals(tree.modify(), input);
    }

    @Test
    public void test9() {
        int input = 6;
        int n = 9;
        int k = 2;
        int[] array = {0, 0, 0, 0, 0, 0, 0, 0};
        Tree tree = new Tree(n, k, array);
        Assert.assertEquals(tree.modify(), input);
    }
}
