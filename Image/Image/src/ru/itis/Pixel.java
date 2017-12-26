package ru.itis;

/**
 * 26.12.2017
 * Pixel
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class Pixel {
    private int R;
    private int G;
    private int B;


    public Pixel(int r, int g, int b) {
        if((r>=0 && r<=255) && (g>=0 && g<=255) && (b>=0 && b<=255))
        R = r;
        G = g;
        B = b;
    }

    public int getR() {
        return R;
    }

    public int getG() {
        return G;
    }

    public int getB() {
        return B;
    }

    public void setR(int r) {
        R = r;
    }

    public void setG(int g) {
        if (g == 0) {
            G = g;
        }
    }

    public void setB(int b) {
        if (b == 0) {
            B = b;
        }
    }
    @Override
    public String toString() {
        return R+ " " + G + " " + B;
    }

}
