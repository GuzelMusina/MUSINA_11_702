package yandex;

/**
 * 25.06.2018
 * Data
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class Data {

    private String name;
    private int numberMon;
    private int numberTue;
    private int numberWed;
    private int numberThu;
    private int numberFri;
    private int numberSat;
    private int numberSun;

    public String getName() {
        return name;
    }

    public Data(String s){

        String[] strings = s.split(" ");
        name = strings[0];
        numberMon = Integer.parseInt(strings[1]);
        numberTue = Integer.parseInt(strings[2]);
        numberWed = Integer.parseInt(strings[3]);
        numberThu = Integer.parseInt(strings[4]);
        numberFri = Integer.parseInt(strings[5]);
        numberSat = Integer.parseInt(strings[6]);
        numberSun = Integer.parseInt(strings[7]);
    }

    public int middleUsers(){
        return (numberMon+numberTue+numberThu+numberWed+numberFri+numberSat+numberSun)/7;
    }

}