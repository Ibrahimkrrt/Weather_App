package com.example.zeone.weatherapp.Common;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Common {
    public static String API_Key = "fcc125859379213a0e906f866996f40d";
    public static String API_LINK ="http://api.openweathermap.org/data/2.5/weather";

    public static String API_Request(String lat, String lon){
        StringBuilder StringB = new StringBuilder(API_LINK);
        StringB.append(String.format("?lat=%s&lon=%s&units=metric",lat,lon,API_Key));

        return StringB.toString();
    }

    public static String unixTimeStampToDataTime(double unixTimeStamp){
        DateFormat dataF = new SimpleDateFormat("HH:mm");
        Date date = new Date();
        date.setTime((long)unixTimeStamp*1000);
        return dataF.format(date);
    }
    //            String
    public static void    getImage(String icon){}

    public static String getDateNow(){
        DateFormat date_format = new SimpleDateFormat("dd MMMM yyyy HH:mm");
        Date date = new Date();
        return date_format.format(date);
    }

/*
    public static String unixTimeStampToDataTime(double unixTimeStamp){
        SimpleDateFormat dataF = new SimpleDateFormat("HH:mm", Locale.FRANCE);
        String date = dataF.format(calendar.getTime());
        // dataF.setTime(long)unixTimeStamp=1000;
        return date;
    }
*/


}
