package com.example.brizz.kamussunda.Pojo;

/**
 * Created by brizz on 9/19/17.
 */

public class ListProperties {
    private String bIndo;
    private String bSunda;
    private int imageView = TIDAK_DIBERI_GAMBAR;

    private static final int TIDAK_DIBERI_GAMBAR = -1;

    private int mAudio;

    public ListProperties(String bIndo, String bSunda) {
        this.bIndo = bIndo;
        this.bSunda = bSunda;
    }

    public ListProperties(String bIndo, String bSunda, int imageView, int mAudio) {
        this.bIndo = bIndo;
        this.bSunda = bSunda;
        this.imageView = imageView;
        this.mAudio = mAudio;
    }

    public String getbIndo() {
        return bIndo;
    }

    public String getbSunda() {
        return bSunda;
    }

    public int getImageView() {
        return imageView;
    }

    public boolean dapatGambar(){
        return imageView != TIDAK_DIBERI_GAMBAR;
    }

    public int getmAudio() {
        return mAudio;
    }
}
