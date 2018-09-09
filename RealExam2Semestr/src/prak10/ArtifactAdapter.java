package prak10;

/**
 * 26.06.2018
 * ArtifactAdapter
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class ArtifactAdapter implements ArtifactInterface  {

    Artifact artifact = new Artifact();

    public ArtifactAdapter(Artifact artifact) {
        this.artifact = artifact;
    }

    @Override
    public void attack() {
        artifact.action1();
    }

    @Override
    public void heal() {
        artifact.action2();
    }
}
