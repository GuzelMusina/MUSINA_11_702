package decorator;

public class FlyingSnake extends Snake{
    private SnakeInterface snake;

    public FlyingSnake(SnakeInterface snake) {
        super();
        this.snake = snake;
    }

    public void fly() {
        System.out.println("*silence flying*");
    }

    @Override
    public void creep() {
        snake.creep();
    }

    @Override
    public void eat(int experience) {
        snake.eat(experience);
    }

    @Override
    public int getExperience() {
        return snake.getExperience();
    }
}

