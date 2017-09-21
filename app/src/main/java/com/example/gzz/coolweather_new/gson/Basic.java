package com.example.gzz.coolweather_new.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by gzz on 2017/9/19.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;
    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
