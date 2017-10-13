package com.michaelfotiadis.locationmanagerviewer;

import android.app.Application;

import com.michaelfotiadis.locationmanagerviewer.data.datastore.Singleton;
import com.michaelfotiadis.locationmanagerviewer.utils.AppLog;


public class LocationApplication extends Application {
    @Override
    public void onCreate() {
        AppLog.i("Singleton Initialised with App Context");
        Singleton.getInstance().setContext(this.getApplicationContext());
        super.onCreate();
    }
}
