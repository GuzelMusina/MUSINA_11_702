package strategy;

/**
 * 24.06.2018
 * KnifeStrategy
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class KnifeStrategy implements Strategy{

    @Override
    public void attack() {
        System.out.println("Knife attack!");
    }
}
