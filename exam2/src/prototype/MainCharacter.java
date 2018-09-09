package prototype;

/**
 * 25.06.2018
 * MainCharacter
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class MainCharacter implements Character {

    protected String name;

    public MainCharacter(String name) {
        this.name = name;
    }

    @Override
    public MainCharacter clone() {
       return new MainCharacter(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void run(){
        System.out.println("*run*");
    }
    public void talk(){
        System.out.println("*talk*");
    }
    public void attack(){
        System.out.println("*attack*");
    }
}
