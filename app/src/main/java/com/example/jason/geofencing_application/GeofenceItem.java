package com.example.jason.geofencing_application;

import com.google.android.gms.maps.model.LatLng;

/**
 * Created by Jason on 25.05.2017.
 */

public class GeofenceItem {
    public boolean active = false;

    private LatLng exactPlace;
    private String place;
    private final String TAG;
    private float rad;  // in meters

    public GeofenceItem(LatLng exactPlace, String place, float rad, String tag) {
        this.exactPlace = exactPlace;
        this.place = place;
        this.rad = rad;
        this.TAG = tag;
    }


    public LatLng getExactPlace() {
        return exactPlace;
    }

    public void setExactPlace(LatLng exactPlace) {
        this.exactPlace = exactPlace;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public float getRad() {
        return rad;
    }

    public void setRad(float rad) {
        this.rad = rad;
    }

    public String getTAG() {
        return TAG;
    }
}
