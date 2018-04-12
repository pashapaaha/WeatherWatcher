package com.pashaandreyev.classesset;

class Weather {
    private int weatherID;
    private String mainCharacteristic;
    private String description;
    private String icon;

    public Weather(int id, String main, String description, String icon) {
        this.weatherID = id;
        this.mainCharacteristic = main;
        this.description = description;
        this.icon = icon;
    }

    public int getWeatherID() {
        return weatherID;
    }

    public void setWeatherID(int weatherID) {
        this.weatherID = weatherID;
    }

    public String getMainCharacteristic() {
        return mainCharacteristic;
    }

    public void setMainCharacteristic(String mainCharacteristic) {
        this.mainCharacteristic = mainCharacteristic;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}
