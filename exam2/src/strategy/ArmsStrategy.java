package strategy;

/**
 * 24.06.2018
 * ArmsStrategy
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class ArmsStrategy implements Strategy {


    @Override
    public void attack() {
        System.out.println("Arms attack!");
    }
}
