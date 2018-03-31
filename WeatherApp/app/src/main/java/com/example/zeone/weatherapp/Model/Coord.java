package com.example.zeone.weatherapp.Model;

public class Coord {
    private  double lat;
    private  double lon;

    public Coord(double lat, double lon){
        this.lat = lat;
        this.lon = lon;
    }

    public double getLat() { return this.lat; }
    public double getLon() { return this.lon; }

    public void setLat(double lat) { this.lat = lat; }
    public void setLon(double lat) { this.lon = lon; }
}
