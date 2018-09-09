package command;

import java.util.ArrayList;
import java.util.List;

public class Legion implements ArmyComponent {
    public List<ArmyComponent> armyComponents;

    public Legion() {
        armyComponents = new ArrayList<>();
    }

    public Legion(List<ArmyComponent> armyComponents) {
        this.armyComponents = armyComponents;
    }

    public void addComponent(ArmyComponent armyComponent) {
        if (armyComponent instanceof Soldier) {
            armyComponents.add(armyComponent);
        }else{
            System.out.println("Cant add it");
        }
    }

    @Override
    public void attack() {
        for (ArmyComponent armyComponent : armyComponents) {
            armyComponent.attack();
        }
        System.out.println("Legion attack");
    }
}