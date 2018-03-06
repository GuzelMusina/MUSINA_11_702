package ru.itis;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * 06.03.2018
 * AnalyzerTest
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class AnalyzerTest {

    private Analyzer analyzerTest;

    @Before
    public void setUp() {
        analyzerTest = new Analyzer();
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


}
