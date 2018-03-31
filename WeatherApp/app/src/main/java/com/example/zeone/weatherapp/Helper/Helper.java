package com.example.zeone.weatherapp.Helper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Helper {
    static  String stream = null;

    public Helper(){}

    public String getHTTPData(String urlString){
        try{
            URL url = new URL(urlString);
            HttpURLConnection Connection = (HttpURLConnection)url.openConnection();
            if (Connection.getResponseCode() == 200) {
                BufferedReader r = new BufferedReader(new InputStreamReader((Connection.getInputStream())));
                StringBuilder StringB = new StringBuilder();
                String line;
                while ((line = r.readLine()) != null ) StringB.append(line);
                stream = StringB.toString();
                Connection.disconnect();
                }
            }
            catch (MalformedURLException e) {
                e.printStackTrace();
            }
            catch (IOException e){
                e.printStackTrace();
            }
            return stream;
        }
    }

