package adapter;

/**
 * 25.06.2018
 * Main
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero("Guzel");
        Artifacte artifacte = new Artifacte();
        hero.fundUnknownArtifacte(artifacte);
        hero.findAdapter();
        hero.getArtefactInt().attack();
        hero.getArtefactInt().heal();
    }
}
