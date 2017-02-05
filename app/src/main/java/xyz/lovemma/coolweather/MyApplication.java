package xyz.lovemma.coolweather;

import android.app.Application;

import org.litepal.LitePal;

/**
 * Created by OO on 2017/2/5.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        LitePal.initialize(this);
    }
}
