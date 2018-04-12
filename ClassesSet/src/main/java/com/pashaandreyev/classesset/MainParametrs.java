package com.pashaandreyev.classesset;

class MainParametrs {
    private double temperature;
    private double pressure;
    private double humidity;
    private double minTemperature;
    private double maxTemperature;
    private double seaPressure;
    private double groundPressure;

    public MainParametrs(double temperature, double pressure, double humidity, double minTemperature, double maxTemperature) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity % 100;
        this.minTemperature = minTemperature;
        this.maxTemperature = maxTemperature;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity % 100;
    }

    public double getMinTemperature() {
        return minTemperature;
    }

    public void setMinTemperature(double minTemperature) {
        this.minTemperature = minTemperature;
    }

    public double getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(double maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    public double getSeaPressure() {
        return seaPressure;
    }

    public void setSeaPressure(double seaPressure) {
        this.seaPressure = seaPressure;
    }

    public double getGroundPressure() {
        return groundPressure;
    }

    public void setGroundPressure(double groundPressure) {
        this.groundPressure = groundPressure;
    }
}
