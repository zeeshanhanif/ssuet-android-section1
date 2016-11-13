package com.example.android.json3;

/**
 * Created by zeeshanhanif-pc on 11/13/2016.
 */
public class EarthQuakeInfo {


    private String type;
    private String title;
    private String mag;
    private String place;

    public EarthQuakeInfo(String type, String title, String mag, String place) {
        this.type = type;
        this.title = title;
        this.mag = mag;
        this.place = place;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMag() {
        return mag;
    }

    public void setMag(String mag) {
        this.mag = mag;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }
}
