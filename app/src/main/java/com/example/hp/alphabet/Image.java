package com.example.hp.alphabet;

/**
 * Created by HP on 8/23/2016.
 */
public class Image {
    private int IdImage;
    private int IdSound;

    public Image(int idImage, int idSound) {
        IdImage = idImage;
        IdSound = idSound;
    }

    public int getIdImage() {
        return IdImage;
    }

    public void setIdImage(int idImage) {
        IdImage = idImage;
    }

    public int getIdSound() {
        return IdSound;
    }

    public void setIdSound(int idSound) {
        IdSound = idSound;
    }
}
