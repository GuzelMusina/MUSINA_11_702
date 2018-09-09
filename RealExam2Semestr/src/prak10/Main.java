package prak10;

/**
 * 26.06.2018
 * Main
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class Main {

    public static void main(String[] args) {

        Hero hero = new Hero("Batman");
        Artifact artifact = new Artifact();

        hero.findUnknownArtifact(artifact);
        System.out.println("But I need special object! We need find it! Without them I can't use artifact!");
        System.out.println("*found*");

        hero.findAdapter();
        System.out.println("Then I can use this artifact.");
        System.out.println("*use it*");

        hero.getUnknownArtifact().attack();

        System.out.println("Really works!");

        hero.getUnknownArtifact().heal();
    }
}
