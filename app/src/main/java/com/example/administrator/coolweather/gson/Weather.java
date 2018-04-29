package com.example.administrator.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Administrator on 2018/4/27.
 */

public class Weather {
    /*
    "HeWeather":{
        "status":"ok",
        "basic":{},
        "aqi":{},
        "now":{},
        "suggestion":{},
        "daily_forecast":{}
    }
     */
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
