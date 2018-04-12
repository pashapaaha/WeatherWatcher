package com.pashaandreyev.classesset;

public class WeatherDataBuilder {
    private WeatherData weatherData;

    private void buildCoordinates(){
        weatherData.setCityLocation(new Coordinates(145.77, -16.92));
    }
    private void buildWeather(){
        weatherData.setWeather(new Weather(803, "Clouds", "broken clouds", "04n"));
    }
    private void buildParams(){
        weatherData.setParams(new MainParametrs(293.25, 1019, 83, 289.82, 296.37));
    }
    private void buildWind(){
        weatherData.setWind(new Wind(5.1, 150));
    }
    private void buildClouds(){
        weatherData.setClouds(new Clouds(75));
    }
    private void buildRain(){
        weatherData.setRain(new Rain(3));
    }
    private void buildCalculationTime(){
        weatherData.setCalculationTime(1435658272);
    }
    private void buildSys(){
        weatherData.setSys(new Sys(1, 8166, 0.0166, "AU", 1435610796, 1435650870));
    }
    private void buildID(){
        weatherData.setCityID(2172797);
    }
    private void buildCityName(){
        weatherData.setCityName("Cairns");
    }
    private void buildCode(){
        weatherData.setCode(200);
    }
    public WeatherData build(){
        weatherData = new WeatherData();
        buildCoordinates();
        buildWeather();
        buildParams();
        buildWind();
        buildClouds();
        buildRain();
        buildCalculationTime();
        buildSys();
        buildID();
        buildCityName();
        buildCode();
        return weatherData;
    }
}
