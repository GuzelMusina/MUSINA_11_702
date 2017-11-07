package ru.itis;
import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {


        Telecast[] telecasts1 = new Telecast[4];
        telecasts1[0] = new Telecast (LocalTime.parse("10:00:00"),LocalTime.parse("12:00:00"), "Dom-2" );
        telecasts1[1] = new Telecast(LocalTime.parse("12:01:00"), LocalTime.parse("13:00:00"), "Univer");
        telecasts1[2] = new Telecast(LocalTime.parse("13:01:00"), LocalTime.parse("15:00:00"), "Sasha&Tanya");
        telecasts1[3] = new Telecast(LocalTime.parse("15:01:00"), LocalTime.parse("19:00:00"), "Street");
        Channel channel1 = new Channel(telecasts1, "THT");

        Telecast[] telecasts2 = new Telecast[4];
        telecasts2[0] = new Telecast (LocalTime.parse("10:00:00"),LocalTime.parse("12:00:00"), "Papiny dochki" );
        telecasts2[1] = new Telecast(LocalTime.parse("12:01:00"), LocalTime.parse("13:00:00"), "Kuhnya");
        telecasts2[2] = new Telecast(LocalTime.parse("13:01:00"), LocalTime.parse("15:00:00"), "WINX");
        telecasts2[3] = new Telecast(LocalTime.parse("15:01:00"), LocalTime.parse("19:00:00"), "Illusion");
        Channel channel2 = new Channel(telecasts2, "STS");

        Telecast[] telecasts3 = new Telecast[4];
        telecasts3[0] = new Telecast (LocalTime.parse("10:00:00"),LocalTime.parse("12:00:00"), "PAZANKI" );
        telecasts3[1] = new Telecast(LocalTime.parse("12:01:00"), LocalTime.parse("13:00:00"), "Orel i Reshka");
        telecasts3[2] = new Telecast(LocalTime.parse("13:01:00"), LocalTime.parse("15:00:00"), "Revizorro");
        telecasts3[3] = new Telecast(LocalTime.parse("15:01:00"), LocalTime.parse("19:00:00"), "Spunch Bob");
        Channel channel3 = new Channel(telecasts3, "Friday");

        Telecast[] telecasts4 = new Telecast[4];
        telecasts4[0] = new Telecast (LocalTime.parse("10:00:00"),LocalTime.parse("12:00:00"), "Odensya k svadbe" );
        telecasts4[1] = new Telecast(LocalTime.parse("12:01:00"), LocalTime.parse("13:00:00"), "Deti Solnca");
        telecasts4[2] = new Telecast(LocalTime.parse("13:01:00"), LocalTime.parse("15:00:00"), "Oh");
        telecasts4[3] = new Telecast(LocalTime.parse("15:01:00"), LocalTime.parse("19:00:00"), "Matrix");
        Channel channel4 = new Channel(telecasts4, "TLC");

        Telecast[] telecasts5 = new Telecast[4];
        telecasts5[0] = new Telecast (LocalTime.parse("10:00:00"),LocalTime.parse("12:00:00"), "Housekeepers" );
        telecasts5[1] = new Telecast(LocalTime.parse("12:01:00"), LocalTime.parse("13:00:00"), "Ironman");
        telecasts5[2] = new Telecast(LocalTime.parse("13:01:00"), LocalTime.parse("15:00:00"), "Happy");
        telecasts5[3] = new Telecast(LocalTime.parse("15:01:00"), LocalTime.parse("19:00:00"), "It");
        Channel channel5 = new Channel(telecasts5, "Netflix");


        Channel[] channels = new Channel[]{
                channel1, channel2, channel3,channel4,channel5
        };
        Television television = Television.getInstance();
        television.setChannels(channels);
        Remote remote = Remote.builder()
                .nameOfRemote("Philips")
                .serialNumber(45269)
                .television(television)
                .manufacturer("China")
                .build();
        remote.switchChannel("TLC");
    }
}
