package ru.itis;

/**
 * 10.10.2017
 * Television
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class Television {

    private Channel[] channels;

    public Channel[] getChannels() {
        return channels;
    }

    public void setChannels(Channel[] channels) {
        this.channels = channels;
    }

    private static final Television instance;


    private Television(){

    }

    public void showNameOfTelecast(String nameOfChannel){

        for (int i = 0; i<channels.length;i++){
            if (channels[i].getNameOfChannel().equals(nameOfChannel)){
                System.out.println(channels[i].findNameOfTelecast());
            }else{
                System.err.println("This name is not exist");
            }
        }
    }

    static {
        instance = new Television();
    }

    public static Television getInstance(){
        return instance;
    }

}
