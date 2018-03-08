package com.example.android.quakereport;

/**
 * Created by myousef on 05.03.18.
 * Project: udacity_QuakeReport
 * © Copyright by myousef
 */
class Earthquake {

    private String mMagnitude;
    private String mLocation;
    private long mTimeInMilliSeconds;

    Earthquake(String mMagnitude, String location, long timeInMilliSeconds) {
        this.mMagnitude = mMagnitude;
        this.mLocation = location;
        this.mTimeInMilliSeconds = timeInMilliSeconds;
    }

    String getMagnitude() {
        return mMagnitude;
    }

    String getLocation() {
        return mLocation;
    }

    long getTimeInMilliSeconds() {
        return mTimeInMilliSeconds;
    }
}
