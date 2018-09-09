package decorator;

public class Game {
        private SnakeInterface snake;

        public void createSnake(String name) {
            snake = new Snake(name);
        }

        public void feedSnake(int i) {
            snake.eat(i);
            if (snake.getExperience() >= 100 && !(snake instanceof FlyingSnake)) {
                snake = new FlyingSnake(snake);
                System.out.println("Now i can fly!");
            }
            if (snake.getExperience() >= 200 && !(snake instanceof SpeakingSnake)) {
                snake = new SpeakingSnake(new FlyingSnake(snake));
                System.out.println("Now i can speak!");
            }
        }

        public void makeSnakeCreep() {
            snake.creep();
        }


        public void makeSnakeSpeak() {
            if (this.snake instanceof SpeakingSnake) {
                ((SpeakingSnake)snake).speak();
            } else {
                System.out.println("Sorry, i can't speaak!");
            }
        }

        public void makeSnakeFly() {
            if (this.snake instanceof FlyingSnake) {
                ((FlyingSnake) snake).fly();
            } else if (this.snake instanceof SpeakingSnake) {
                ((SpeakingSnake) snake).fly();
            } else {
                System.out.println("Sorry, i can't fly!");
            }
        }
    }

