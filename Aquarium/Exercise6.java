package aut.isp.lab4.exercise6;

public class Exercise6 {
    public static void main(String[] args) {
        Alarm alarm=new Alarm();
        LevelSensor water=new LevelSensor();
        water.setWaterPh(8);
        if(water.waterPh>7.5 && water.waterPh<8.2){
            water.changeWaterPh();
        }
        else
            alarm.turnOn();

    }
}
