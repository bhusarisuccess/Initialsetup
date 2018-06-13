package com.example.initialsetup;

import android.app.Application;
import android.content.res.Configuration;

public class DoctorApplication extends Application {
    public DoctorApplication() {
        super();
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }
}
