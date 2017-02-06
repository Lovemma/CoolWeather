package xyz.lovemma.coolweather.gson;

/**
 * Created by OO on 2017/2/6.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
