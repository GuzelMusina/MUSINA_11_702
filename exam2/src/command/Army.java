package command;

import java.util.ArrayList;
import java.util.List;

public class Army implements ArmyComponent {
    private List<ArmyComponent> armyComponents;

    public Army() {
        armyComponents = new ArrayList<>();
    }

    @Override
    public void attack() {
        for (ArmyComponent armyComponent : armyComponents) {
            armyComponent.attack();
        }
        System.out.println("Army attack");
    }

    @Override
    public void addComponent(ArmyComponent armyComponent) {
        if (armyComponent instanceof Division) {
            armyComponents.add(armyComponent);
        }else {
            System.out.println("Can't add");
        }
    }
}

