package com.example.android.quakereport;

/**
 * Created by myousef on 05.03.18.
 * Project: udacity_QuakeReport
 * © Copyright by myousef
 */
class Earthquake {

    private double mMagnitude;
    private String mLocation;
    private long mTimeInMilliSeconds;
    private String mUrl;

    Earthquake(double mMagnitude, String location, long timeInMilliSeconds, String url) {
        this.mMagnitude = mMagnitude;
        this.mLocation = location;
        this.mTimeInMilliSeconds = timeInMilliSeconds;
        this.mUrl = url;
    }

    double getMagnitude() {
        return mMagnitude;
    }

    String getLocation() {
        return mLocation;
    }

    long getTimeInMilliSeconds() {
        return mTimeInMilliSeconds;
    }

    public String getUrl() {
        return mUrl;
    }
}
