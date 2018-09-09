package strategy;

/**
 * 24.06.2018
 * Main
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        player.attack();

        player.findGang();
        player.attack();
        player.attackWGand();
        player.attack();

        player.findKnife();
        player.attackWKnife();
        player.attack();
    }
}
