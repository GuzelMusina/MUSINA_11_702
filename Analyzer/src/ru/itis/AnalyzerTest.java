package ru.itis;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * 06.03.2018
 * AnalyzerTest
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class AnalyzerTest {

    private Analyzer analyzerTest;
    private LinkedHashMap<String, Integer> map;

    @Before
    public void setUp() {
        analyzerTest = new Analyzer();
        map = new LinkedHashMap<>();
    }

    @Test(expected = SyntaxException.class)
    public void testAnalyzer2() {
        String string = "X1:=128;Y2:=56;Z1=X1+Y2";
        analyzerTest.analyze(string);
    }
    @Test(expected = SyntaxException.class)
    public void testAnalyzer3() {
        String string = "X1:=k;Y2:=56;Z1=X1+Y2";
        analyzerTest.analyze(string);
    }
    @Test(expected = SyntaxException.class)
    public void testAnalyzer4() {
        String string = "X1:=128;Y2:=56;Z1=X1+Y2";
        analyzerTest.analyze(string);
    }
    @Test(expected = SyntaxException.class)
    public void testAnalyzer5() {
        String string = "X1:=128;Y2:=56Z1=X1+Y2";
        analyzerTest.analyze(string);
    }
    @Test(expected = SyntaxException.class)
    public void testAnalyzer6() {
        String string = "X1:=128;Y2:=56Z1=X1+Y98";
        analyzerTest.analyze(string);
    }
    @Test(expected = SyntaxException.class)
    public void testAnalyzer7() {
        String string = "X1:=128;Y2:=56Z1=X1*Y2";
        analyzerTest.analyze(string);
    }
    @Test(expected = NotFoundVariableException.class)
    public void testProcess2(){
        String input = "X1:=12;Y2:=24;C3:=5;V4:=X1-C3*Y2/Y2*Z1;Z1:=X1+Y2;Z2:=Y2/X1;Z3:=Z1-Z2;Z4:=X1;X1:=34;Z4:=Z2*Y2;";
        analyzerTest.process(input);
    }

    @Test(expected = NotFoundVariableException.class)
    public void testProcess3(){
        String input = "X1:=12;Y2:=24;C3:=5;V4:=X1-C3*Y2/Y2*X1;Z1:=X1+Y2;Z2:=Y2/T1;Z3:=Z1-Z2;Z4:=X1;X1:=34;Z4:=Z2*Y2;";
        analyzerTest.process(input);
    }


    @Test
    public void testProcess5(){
        String input = "X1:=124;Y2:=0;Z1:=Y2;C2:=Y2/X1;Z3:=X1*Y2;C4:=Y2+X1-Y2;C5:=Y2+Y2+Y2-Y2*Y2;";
        map.put("X1", 124);
        map.put("Y2", 0);
        map.put("Z1", 0);
        map.put("C2", 0);
        map.put("Z3", 0);
        map.put("C4", 124);
        map.put("C5", 0);
        Assert.assertEquals(map, analyzerTest.process(input));
    }

    @Test(expected = RuntimeException.class)
    public void testProcess6(){
        String input = "X1:=124548;Y2:=X1-X1;Z1:=0;C2:=X1/Z1;";
        analyzerTest.process(input);
    }

    @Test(expected = NotFoundVariableException.class)
    public void testProcess7(){
        String input = "X1:=12;Y2:=24;C3:=5;V4:=X1-C3*Y2/Y2*X1;Z1:=X1+Y2;Z2:=Y2/T1;Z3:=Z1-Z2;Z4:=X1;X1:=Z5;Z4:=Z2*Y2;";
        analyzerTest.process(input);
    }

    @Test
    public void testProcess8(){
        String input = "X1:=-2;X2:=-X1;X3:=X2/X1;X4:=X1*X2;X5:=-X1*X2;";
        map.put("X1", -2);
        map.put("X2", 2);
        map.put("X3", -1);
        map.put("X4", -4);
        map.put("X5", 4);
        Assert.assertEquals(map, analyzerTest.process(input));
    }


}
