package ru.itis;

import javafx.scene.chart.ValueAxis;

import java.util.LinkedHashMap;
import java.util.LinkedList;
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

    LinkedHashMap<String, Integer> process(String input) {

        LinkedHashMap<String, Integer> list = new LinkedHashMap<>();
        int indexLeft = -1;
        int indexRight = -1;
        while (indexRight != input.length() - 1) {
            indexLeft = input.indexOf(':', indexLeft + 1);              // It returns the index of first occurrence if character ch,
            // starting from the specified index “fromIndex”.
            String number;
            int value = 0;


            if (indexRight == 0) {
                number = input.substring(0);
            } else {
                number = input.substring(indexRight + 1, indexLeft);
            }
            indexRight = input.indexOf(';', indexRight + 1);


            if (list.containsKey(number)) {                                         //return true, if collection has key "number"
                list.remove(number);
            }


            try {
                value = Integer.parseInt(input.substring(indexLeft + 2, indexRight)); // substring: return substring from indexLeft+2, to indexRight
            } catch (Exception e) {
                char operator = ' ';
                StringBuilder part = new StringBuilder();
                boolean minus = false;


                for (int i = indexLeft + 2; i <= indexRight; i++) {

                    char current = input.charAt(i);


                    if (current != ';' && current != '+' && current != '-' && current != '*' && current != '/') {
                        part.append(current);
                    } else {
                        if (!list.containsKey(part.toString()) && (!part.toString().equals("") && current != '-')) {
                            throw new NotFoundVariableException();
                        }

                        int partValue = 0;


                        if (part.toString().equals("") && current == '-') {
                            minus = true;
                        }


                        if (!part.toString().equals("")) {
                            if (minus) {
                                partValue = -list.get(part.toString());
                            } else {
                                partValue = list.get(part.toString());
                            }
                        }

                        minus = false;

                        switch (operator) {
                            case ('-'): {
                                value -= partValue;
                                break;
                            }
                            case ('+'): {
                                value += partValue;
                                break;
                            }
                            case ('*'): {
                                value *= partValue;
                                break;
                            }
                            case ('/'): {
                                value /= partValue;
                                break;
                            }
                            case (' '): {
                                value = partValue;
                            }
                        }
                        if (current != ';') {
                            operator = current;
                        }
                        part = new StringBuilder();
                    }
                }
            }

            list.put(number, value);
        }
        return list;
    }

}
