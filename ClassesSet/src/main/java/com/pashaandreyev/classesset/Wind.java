package com.pashaandreyev.classesset;

class Wind {
    private double speed;
    private double direction;

    public Wind(double speed, double direction) {
        this.speed = speed;
        this.direction = direction % 360;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getDirection() {
        return direction;
    }

    public void setDirection(double direction) {
        this.direction = direction % 360;
    }
}
