package com.noe.mvp;

import android.app.Application;

import timber.log.Timber;

/**
 * Created by Lee on 17/3/6.
 * 基类application
 */

public class MAVApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        if (BuildConfig.DEBUG){
            Timber.plant(new Timber.DebugTree());
        }
    }
}
