package ru.itis;

import com.sun.org.apache.regexp.internal.RE;

/**
 * 10.10.2017
 * Remote
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class Remote {

    private Television television;
    private String nameOfRemote;
    private int serialNumber;
    private String nameOfFirm;
    private String manufacturer;
    private int howLongItWorks;

    public Remote(Builder builder) {
        this.television = builder.television;
        this.nameOfRemote = builder.nameOfRemote;
        this.serialNumber = builder.serialNumber;
        this.nameOfFirm = builder.nameOfFirm;
        this.manufacturer = builder.manufacturer;
        this.howLongItWorks = builder.howLongItWorks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private Television television;
        private String nameOfRemote;
        private int serialNumber;
        private String nameOfFirm;
        private String manufacturer;
        private int howLongItWorks;

        public Builder television(Television television) {
            this.television = television;
            return this;
        }

        public Builder nameOfRemote(String nameOfRemote) {
            this.nameOfRemote = nameOfRemote;
            return this;
        }

        public Builder serialNumber(int serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }

        public Builder nameOfFirm(String nameOfFirm) {
            this.nameOfFirm = nameOfFirm;
            return this;
        }

        public Builder manufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
            return this;
        }

        public Builder howLongItWorks(int howLongItWorks) {
            this.howLongItWorks = howLongItWorks;
            return this;
        }

        public Remote build() {
            return new Remote(this);
        }
    }


    public Television getTelevision() {
        return television;
    }

    public String getNameOfRemote() {
        return nameOfRemote;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public String getNameOfFirm() {
        return nameOfFirm;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getHowLongItWork() {
        return howLongItWorks;
    }

    public void switchChannel(String nameOfChannel) {
        television.showNameOfTelecast(nameOfChannel);
    }
}
