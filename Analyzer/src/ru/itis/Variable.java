package ru.itis;

/**
 * 06.03.2018
 * Variable
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class Variable {
    private char letter;
    private int number;

    public Variable(char letter, int number) {
        if ((letter >= 'A' && letter <= 'Z') && (number >= 1 && number <= 9)) {
            this.letter = letter;
            this.number = number;
        }
    }

    public Variable() {
    }

    public char getLetter() {
        return letter;
    }

    public int getNumber() {
        return number;
    }
}
