package ru.itis;

/**
 * 10.10.2017
 * Channel
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class Channel {

    private Telecast[] telecasts;
    private String nameOfChannel;


    public Channel() {
    }

    public Channel(Telecast[] telecasts, String nameOfChannel) {
        this.telecasts = telecasts;
        this.nameOfChannel = nameOfChannel;
    }

    public Telecast[] getTelecasts() {
        return telecasts;
    }

    public void setTelecasts(Telecast[] telecasts) {
        this.telecasts = telecasts;
    }

    public String getNameOfChannel() {
        return nameOfChannel;
    }

    public void setNameOfChannel(String nameOfChannel) {
        this.nameOfChannel = nameOfChannel;
    }

    public String findNameOfTelecast () {
        String result = null;
        for (int i = 0; i < telecasts.length; i++) {
            if (telecasts[i].getNameOfTelecast() == telecasts[i].whatTheTelecastIsNow()) {
                result = telecasts[i].getNameOfTelecast();
            } else
                System.err.println("Haven't this telecast");
        }return result;
    }
}
