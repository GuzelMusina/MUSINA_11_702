package decorator;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();

        game.createSnake("Tommy");
        game.feedSnake(100);
        game.makeSnakeCreep();
        game.makeSnakeSpeak();
        game.makeSnakeFly();
        game.feedSnake(200);
        game.makeSnakeFly();
        game.makeSnakeSpeak();

    }
}
