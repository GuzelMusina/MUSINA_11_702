package adapter;

/**
 * 25.06.2018
 * Hero
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class Hero {

    private String name;
    private Artifacte unknownArtifacte;
    private ArtefactInt artefactInt;

    public Hero(String name) {
        this.name = name;
    }

    public void fundUnknownArtifacte(Artifacte artifacte){
        this.unknownArtifacte = artifacte;
    }

    public void findAdapter(){
        artefactInt = new ArtifacteAdapter(unknownArtifacte);

    }

    public ArtefactInt getArtefactInt(){
        return artefactInt;
    }
}
