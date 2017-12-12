package ru.itis;

import java.time.LocalTime;

/**
 * 10.10.2017
 * Telecast
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class Telecast {

    private LocalTime begin;
    private LocalTime finish;
    private String nameOfTelecast;


    public Telecast(LocalTime begin, LocalTime finish, String nameOfTelecast) {
        this.begin = begin;
        this.finish = finish;
        this.nameOfTelecast = nameOfTelecast;
    }


    public LocalTime getBegin() {
        return begin;
    }

    public void setBegin(LocalTime begin) {
        this.begin = begin;
    }

    public LocalTime getFinish() {
        return finish;
    }

    public void setFinish(LocalTime finish) {
        this.finish = finish;
    }

    public String getNameOfTelecast() {
        return nameOfTelecast;
    }

    public void setNameOfTelecast(String nameOfTelecast) {
        this.nameOfTelecast = nameOfTelecast;
    }

    public String whatTheTelecastIsNow() {
        if (LocalTime.now().isAfter(begin) &&
                LocalTime.now().isBefore(finish)) {
            return this.getNameOfTelecast();
        } else {
            return null;
        }
    }
}
