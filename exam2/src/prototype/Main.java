package prototype;

/**
 * 25.06.2018
 * Main
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class Main {
    public static void main(String[] args) {
        MainCharacter prototype = new MainCharacter("Jhonshua");
        System.out.println("Hi! My Name is " + prototype.getName());
        prototype.run();
        prototype.attack();
        System.out.println("I am very poverful!");
        prototype.talk();
        System.out.println("Hm, I found a blue drugs");
        System.out.println("*drink it*");

        MainCharacter clone = prototype.clone();
        clone.setName(prototype.name);

        System.out.println("Hi! My Name is " + clone.getName());
        System.out.println("*подозрительный взгляд других игроков*");
        clone.run();
        clone.attack();
        System.out.println("I am very poverful!");
        clone.talk();

    }
}
