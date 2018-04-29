package com.example.administrator.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2018/4/27.
 */

public class Suggestion {
    /*
    "suggestion":{
        "comf":{
            "txt":"白天天气较热，虽然有雨，但任然无法削弱较高气温给人们带来的暑意"
        }
        "cw":{
            "txt":"不宜洗车，未来24小时内会有雨，如果再次期间洗车可能路上的泥水会再次弄脏您的车"
        }
        "sport":{
            "txt":"有降水，且风力较强，推荐您在室内进行低强度活动"
        }
    }
     */
    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    @SerializedName("sport")
    public Sport sport;

    public class Comfort{
        @SerializedName("txt")
        public String info;
    }

    public class CarWash{
        @SerializedName("txt")
        public String info;
    }

    public class Sport{
        @SerializedName("txt")
        public String info;
    }
}
