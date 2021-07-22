package com.umar.mytestapp;

import android.app.Application;

import com.moengage.core.LogLevel;
import com.moengage.core.MoEngage;
import com.moengage.core.config.LogConfig;
import com.moengage.core.config.NotificationConfig;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // this is the instance of the application class and "RR48S612TB18QUNTW8G8GV79" is the APP ID from the dashboard.
        MoEngage moEngage =
                new MoEngage.Builder(this, "RR48S612TB18QUNTW8G8GV79")
                        .configureLogs(new LogConfig(
                                LogLevel.VERBOSE,
                                true
                        ))
                        .configureNotificationMetaData(new NotificationConfig(
                                R.drawable.ic_stat_name,
                                R.color.teal_700
                        ))
                        .build();
        MoEngage.initialise(moEngage);
    }
}
