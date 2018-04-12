package com.pashaandreyev.classesset;

public class WeatherData {

    private Coordinates cityLocation;
    private Weather mWeather;
    private MainParametrs params;
    private Wind mWind;
    private Clouds mClouds;
    private Rain mRain;
    private Snow mSnow;
    private int calculationTime;
    private String cityName;
    private Sys sys;
    private int cityID;
    private int code;

    public Coordinates getCityLocation() {
        return cityLocation;
    }

    public void setCityLocation(Coordinates cityLocation) {
        this.cityLocation = cityLocation;
    }

    public Weather getWeather() {
        return mWeather;
    }

    public void setWeather(Weather weather) {
        mWeather = weather;
    }

    public MainParametrs getParams() {
        return params;
    }

    public void setParams(MainParametrs params) {
        this.params = params;
    }

    public Wind getWind() {
        return mWind;
    }

    public void setWind(Wind wind) {
        mWind = wind;
    }

    public Clouds getClouds() {
        return mClouds;
    }

    public void setClouds(Clouds clouds) {
        mClouds = clouds;
    }

    public Rain getRain() {
        return mRain;
    }

    public void setRain(Rain rain) {
        mRain = rain;
    }

    public Snow getSnow() {
        return mSnow;
    }

    public void setSnow(Snow snow) {
        mSnow = snow;
    }

    public int getCalculationTime() {
        return calculationTime;
    }

    public void setCalculationTime(int calculationTime) {
        this.calculationTime = calculationTime;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Sys getSys() {
        return sys;
    }

    public void setSys(Sys sys) {
        this.sys = sys;
    }

    public int getCityID() {
        return cityID;
    }

    public void setCityID(int cityID) {
        this.cityID = cityID;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
