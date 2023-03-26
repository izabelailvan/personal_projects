package aut.isp.lab4.exercise6;

abstract class Sensor {

    private String manufactured;
    private String model;
    public float waterPh;

    public Sensor() {
    }

    public void setWaterPh(float waterPh) {
        this.waterPh = waterPh;
    }

    public void changeWaterPh() {
        System.out.println("The water ph was changed");
    }

    public String toString() {
        return "Sensor{" +
                "manufactured=" + manufactured +
                ", model=" + model +
                ", waterPh=" + waterPh +
                '}';
    }
}
