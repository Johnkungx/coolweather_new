package com.example.gzz.coolweather_new.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by gzz on 2017/9/19.
 */

public class AQI {
    public AQICity city;

    public class AQICity{
        public String aqi;

        public String pm25;
    }

}
