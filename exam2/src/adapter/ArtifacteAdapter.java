package adapter;

/**
 * 25.06.2018
 * ArtifacteAdapter
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class ArtifacteAdapter implements ArtefactInt {

    private Artifacte adaptee;

    public ArtifacteAdapter(Artifacte adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void heal() {
        adaptee.action1();
    }

    @Override
    public void attack() {
        adaptee.action2();
    }
}
