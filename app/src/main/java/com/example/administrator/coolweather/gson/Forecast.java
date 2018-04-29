package com.example.administrator.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2018/4/27.
 */

public class Forecast {
   /*
    "daily_forecast":{
        {
            "date":"2016-08-08",
            "cond":{
                "txt_d":"阵雨"
            },
            "tmp":{
                "max":"34",
                "min":"27"
            }
        },

        {
            "date":"2016-08-09",
            "cond":{
                "txt_d":"多云"
            },
            "tmp":{
                "max":"35",
                "min":"29"
            }
        }
        ...
    }
    */

   public String date;

   @SerializedName("cond")
    public More more;

   @SerializedName("tmp")
    public Temperature temperature;

   public class More{
       @SerializedName("txt_d")
       public String info;
    }

    public class Temperature{
       public String max;
       public String min;
    }

}
