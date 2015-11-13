package com.example.leah.presidents;


import android.graphics.drawable.Drawable;
import android.media.Image;

import java.io.Serializable;

public class President implements Serializable{


    private int number;
    private String president;
    private int birthYear;
    private Integer deathYear;
    private String tookOffice;
    private String leftOffice;
    private String party;

    public President(){}


    public int getNumber() {
        return number;
    }

    public String getPresident() { return president; }

    public int getBirthYear() {
        return birthYear;
    }

    public Integer getDeathYear() {
        return deathYear;
    }

    public String getTookOffice() {
        return tookOffice;
    }

    public String getLeftOffice() {
        return leftOffice;
    }

    public String getParty() {
        return party;
    }
}
