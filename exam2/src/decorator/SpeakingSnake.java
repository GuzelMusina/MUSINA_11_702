package decorator;

public class SpeakingSnake extends Snake{
    private SnakeInterface snake;

    public SpeakingSnake(SnakeInterface snake) {
        this.snake = snake;
    }

    public void speak() {
        System.out.println("Now i can speak!!!");
    }

    @Override
    public void creep() {
        snake.creep();
    }

    public void fly() {
        ((FlyingSnake)snake).fly();
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

