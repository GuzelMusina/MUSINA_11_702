package ru.itis;

public class Main {

    public static void main(String[] args) {

       String string = new String("(3+(5*4))");
       ParseTree tree = new ParseTree();
       tree.insert(string);
       tree.printByLevels();


    }
}
