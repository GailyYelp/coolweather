package com.example.administrator.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2018/4/27.
 */

public class Basic {
    /*
    "basic":{
        "city":"苏州",
        "id":"CN101190401",
        "update":{
            "loc":"2016-08-08 21:58"
        }
    }
    */
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
