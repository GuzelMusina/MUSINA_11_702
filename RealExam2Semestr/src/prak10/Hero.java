package prak10;

/**
 * 26.06.2018
 * Hero
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class Hero {

    private String name;
    private Artifact unknownArtifact;
    private ArtifactInterface artifactInterface;

    public Hero(String name) {
        this.name = name;
    }

    public void findUnknownArtifact(Artifact artifact){
        this.unknownArtifact = artifact;
        System.out.println("I found an artifact!");
    }

    public void findAdapter(){
        this.artifactInterface = new ArtifactAdapter(unknownArtifact);
        System.out.println("Yeeeah!!! I found a special object!");
    }

    public ArtifactInterface getUnknownArtifact(){
        return artifactInterface;
    }
}
