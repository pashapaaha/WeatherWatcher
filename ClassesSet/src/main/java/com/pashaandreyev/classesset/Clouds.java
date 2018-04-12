package com.pashaandreyev.classesset;

class Clouds {
    private double cloudiness;

    public double getCloudiness() {
        return cloudiness;
    }

    public void setCloudiness(double cloudiness) {
        this.cloudiness = cloudiness % 100;
    }

    public Clouds(double cloudiness) {

        this.cloudiness = cloudiness % 100;
    }
}
