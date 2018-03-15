package ru.itis;

public class Main {

    public static void main(String[] args) {

        Human marsel = new Human(24, "Marsel");
        Human marat = new Human(18, "Maxim");
        Human ruslan = new Human(16, "Ruslan");
        Human guzel = new Human(19, "Guzel");
        Human masha = new Human(67, "Maha");
        Human po = new Human(1, "Po");
        Human krud = new Human(34, "Krud");

        String key1 = "Botanik";
        String key2 = "Scala";
        String key3 = "Net";
        String key4 = "Miss";
        String key5 = "MUMU";
        String key6 = "Fashion";
        String key7 = "Tyt";


        HashMap<String, Human> humanMyHashMap = new HashMap<>();
        humanMyHashMap.put(key1, marsel);
        humanMyHashMap.put(key2, marat);
        humanMyHashMap.put(key3, ruslan);
        humanMyHashMap.put(key4, guzel);
        humanMyHashMap.put(key5, masha);
        humanMyHashMap.put(key6, po);
        humanMyHashMap.put(key7, krud);

        System.out.println(humanMyHashMap.get("Miss"));
    }
}
