package strategy;

/**
 * 24.06.2018
 * Player
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class Player {

    private Strategy currentStrategy;
    private boolean hasGang;
    private boolean hasKnife;

    public Player() {
        currentStrategy = new ArmsStrategy();
    }

    public void attackWGand(){
        setStrategy(new GangStrategy());
    }

    public void attackWKnife(){
        setStrategy(new KnifeStrategy());
    }

    public void setStrategy(Strategy strategy){
        if(strategy instanceof ArmsStrategy){
            currentStrategy = strategy;
        }else if(strategy instanceof GangStrategy && hasGang){
            currentStrategy = strategy;
        }else if(strategy instanceof KnifeStrategy && hasKnife){
            currentStrategy = strategy;
        }else {
            System.out.println("Sorry, you can't use it");
        }
    }

    public void findGang(){
        hasGang = true;
        System.out.println("I find a gun");
    }
    public void findKnife(){
        hasKnife = true;
        System.out.println("I find a knife");
    }

    public void attack(){
        currentStrategy.attack();
    }
}
