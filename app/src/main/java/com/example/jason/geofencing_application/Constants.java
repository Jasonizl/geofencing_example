package com.example.jason.geofencing_application;

import com.google.android.gms.location.Geofence;
import com.google.android.gms.maps.model.LatLng;

import java.util.HashMap;

/**
 * Created by Jason on 24.05.2017.
 */

public final class Constants {

    private Constants() {
    }

    public static final String PACKAGE_NAME = "com.google.android.gms.location.Geofence";

    public static final String SHARED_PREFERENCES_NAME = PACKAGE_NAME + ".SHARED_PREFERENCES_NAME";

    public static final String GEOFENCES_ADDED_KEY = PACKAGE_NAME + ".GEOFENCES_ADDED_KEY";

    /**
     * We don't want our geofences deleted after a set amount of time.
     */
    public static final long GEOFENCE_EXPIRATION = Geofence.NEVER_EXPIRE;

    /**
     * amplify by multiplying.
     */
    public static final float GEOFENCE_RADIUS_IN_METERS = 1000;

    public static final HashMap<String, GeofenceItem> DEFAULT_LANDMARKS = new HashMap<String, GeofenceItem>();
    static {
        // Berlin center
        DEFAULT_LANDMARKS.put("BERLIN",
                new GeofenceItem(new LatLng(52.518603, 13.402829),
                        "Berlin",
                        15000,
                        "BERLIN"));

        // New York
        DEFAULT_LANDMARKS.put("NEW YORK",
                new GeofenceItem(new LatLng(40.727944, -74.003416),
                        "New York",
                        25000,
                        "NEW YORK"));

        // TU Hauptgebäude
        DEFAULT_LANDMARKS.put("TU-HAUPT",
                new GeofenceItem(new LatLng(52.512403, 13.327038),
                        "TU-Hauptgebäude",
                        75,
                        "TU-HAUPT"));

        // TEL Gebäude
        DEFAULT_LANDMARKS.put("TU-TEL",
                new GeofenceItem(new LatLng(52.512964, 13.320052),
                        "TU-TELGebäude",
                        40,
                        "TU-TEL"));

        // Zuhause
        DEFAULT_LANDMARKS.put("ZUHAUSE",
                new GeofenceItem(new LatLng(52.585091, 13.409806),
                        "Zuhause",
                        30,
                        "ZUHAUSE"));

    }

}
