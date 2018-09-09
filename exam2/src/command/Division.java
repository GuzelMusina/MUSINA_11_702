package command;

import java.util.ArrayList;
import java.util.List;

public class Division implements ArmyComponent {
    private List<ArmyComponent> armyComponents;

    public Division() {
        armyComponents = new ArrayList<>();
    }

    public Division(List<ArmyComponent> armyComponents) {
        this.armyComponents = armyComponents;
    }

    @Override
    public void attack() {
        for (ArmyComponent armyComponent : armyComponents) {
            armyComponent.attack();
        }
        System.out.println("Division attack");
    }

    @Override
    public void addComponent(ArmyComponent armyComponent) {
        if (armyComponent instanceof Legion) {
            armyComponents.add(armyComponent);
        }else {
            System.out.println("Cant add anyone else");
        }
    }
}
