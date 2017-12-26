package ru.itis;

import java.util.Arrays;
import java.util.Random;

/**
 * 26.12.2017
 * Image
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class Image {

    private Pixel[][] image = new Pixel[16][16];
    Random random = new Random();

    public Image() {
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image.length; j++) {
                image[i][j] = new Pixel(random.nextInt(255), random.nextInt(255), random.nextInt(255));
            }
        }
    }

    public Image getRComponent() {
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image.length; j++) {
                image[i][j].setG(0);
                image[i][j].setB(0);
            }
        }
        return this;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image.length; j++) {
                stringBuilder.append("{" + image[i][j] + "}");
            }
        }
        return stringBuilder.toString();
    }
}
