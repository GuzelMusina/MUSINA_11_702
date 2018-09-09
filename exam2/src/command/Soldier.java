package command;

public class Soldier implements ArmyComponent {

    @Override
    public void attack() {
        System.out.println("One soldier attacking");
    }

    @Override
    public void addComponent(ArmyComponent armyComponent) {

    }
}