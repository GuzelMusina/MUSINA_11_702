package ru.itis;

import javafx.scene.chart.ValueAxis;

import java.util.List;
import java.util.Scanner;

/**
 * 06.03.2018
 * Analyzer
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class Analyzer {

    //X1:=128;Y2:=56;Z1=X1+Y2;
    public void analyze(String input) {

        int statement = 0;
        int count = 0;
        while (count != input.length() - 1) {
            switch (statement) {
                case 0:
                    if (input.charAt(count) >= 'A' && input.charAt(count) <= 'Z') {
                        statement = 1;
                        count++;
                        break;
                    } else throw new SyntaxException();
                case 1:
                    if (input.charAt(count) >= '1' && input.charAt(count) <= '9') {
                        statement = 2;
                        count++;
                        break;
                    } else throw new SyntaxException();
                case 2:
                    if (input.charAt(count) == ':') {
                        statement = 3;
                        count++;
                        break;
                    } else throw new SyntaxException();
                case 3:
                    if (input.charAt(count) == '=') {
                        statement = 4;
                        count++;
                        break;
                    } else throw new SyntaxException();
                case 4:
                    if (input.charAt(count) >= '0' && input.charAt(count) <= '9') {
                        statement = 5;
                        count++;
                        break;
                    } else if (input.charAt(count) == ';') {
                        statement = 6;
                        count++;
                        break;
                    } else if (input.charAt(count) >= 'A' && input.charAt(count) <= 'Z') {
                        statement = 7;
                        count++;
                        break;
                    } else throw new SyntaxException();
                case 5:
                    if (input.charAt(count) >= '0' && input.charAt(count) <= '9') {
                        statement = 5;
                        count++;
                        break;
                    } else if (input.charAt(count) == ';') {
                        statement = 6;
                        break;
                    } else throw new SyntaxException();
                case 6:
                    statement = 0;
                    count++;
                    break;
                case 7:
                    if (input.charAt(count) >= '0' && input.charAt(count) <= '9') {
                        statement = 8;
                        count++;
                        break;
                    } else throw new SyntaxException();

                case 8:
                    if (input.charAt(count) == '+' || input.charAt(count) == '-' ||
                            input.charAt(count) == '*' || input.charAt(count) == '/') {
                        statement = 9;
                        count++;
                        break;
                    } else throw new SyntaxException();
                case 9:
                    statement = 4;
                    break;
            }

        }

    }

    public List<Variable> process(String input) {

    }

}
