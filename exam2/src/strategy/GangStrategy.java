package strategy;

/**
 * 24.06.2018
 * GangStrategy
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class GangStrategy implements Strategy {
    @Override
    public void attack() {
        System.out.println("Gang attack!");
    }
}
