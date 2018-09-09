package decorator;


    public class Snake implements SnakeInterface {
        private int experience;
        private String name;

        public Snake(String name) {
            this.name = name;
        }

        public Snake() {

        }

        public void creep() {
            System.out.println("*silence creeping*");
        }

        public void eat(int experience) {
            this.experience += experience;
            System.out.println("*eating in silence*");
            System.out.println("Current experience: " + this.experience);
        }

        @Override
        public int getExperience() {
            return experience;
        }


    }

