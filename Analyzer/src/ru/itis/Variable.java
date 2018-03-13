package ru.itis;

/**
 * 06.03.2018
 * Variable
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class Variable {
    private String name;
    private int number;

    public Variable(String name, int number) {
        this.name=name;
        this.number = number;
    }

    public Variable() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return name + "=" + number ;
    }
}
