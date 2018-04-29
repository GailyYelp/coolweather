package com.example.administrator.coolweather.gson;

/**
 * Created by Administrator on 2018/4/27.
 */

public class AQI {
    /*
        "aqi":{
        "city":{
            "aqi":"44",
            "pm25":"13"
        }
    }
     */
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
