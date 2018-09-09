package command;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Army army = new Army();
        Division d1 = new Division();
        Division d2 = new Division();

        ArrayList<ArmyComponent> larray1 = new ArrayList<>();
        larray1.add(new Soldier());
        larray1.add(new Soldier());
        larray1.add(new Soldier());

        ArrayList<ArmyComponent> larray2 = new ArrayList<>();
        larray2.add(new Soldier());
        larray2.add(new Soldier());

        ArrayList<ArmyComponent> larray3 = new ArrayList<>();
        larray3.add(new Soldier());

        Legion l1 = new Legion(larray1);
        Legion l2 = new Legion(larray2);
        Legion l3 = new Legion(larray3);

        d1.addComponent(l1);
        d1.addComponent(l2);
        d2.addComponent(l3);

        army.addComponent(d1);
        army.addComponent(d2);

        army.attack();

    }
}
