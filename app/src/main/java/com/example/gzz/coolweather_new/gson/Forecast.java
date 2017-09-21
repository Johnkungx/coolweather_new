package com.example.gzz.coolweather_new.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by gzz on 2017/9/19.
 */

public class Forecast {
    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature{
        public String max;
        public String min;
    }
    public class More{
        @SerializedName("txt_d")
        public String info;
    }
}
