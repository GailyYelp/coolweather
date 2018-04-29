package com.example.administrator.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2018/4/27.
 */

public class Now {
    /*
    "now":{
        "tmp":"29",
        "cond":{
            "txt":"阵雨"
        }
    }
     */

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
