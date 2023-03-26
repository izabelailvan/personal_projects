package aut.isp.lab4.exercise6;

public class AquariumController {
    public String manufactured;

    public String model;
    public float currentTime;
    public FishFeeder feeder;
    public float feedingTime;
    public int temperature;

    public float waterLevel;

    public AquariumController(){}
    public AquariumController(String manufactured, String model){
        this.manufactured=manufactured;
        this.model=model;
    }

    public TemperatureSensor a;

    public Heater h;

    public LevelSensor water;

    public Alarm alarm;
    //methods

    public void setCurrentTime(float currentTime){
        this.currentTime=currentTime;
    }

    public void setTemperature(int temperature){
        this.temperature=temperature;
    }

    public void setWaterLevel(int waterLevel){
        this.waterLevel=waterLevel;
    }
    public String toString(){
        return "AquariumController{" +
                "manufactured=" + manufactured +
                ", model=" + model +
                ", current time=" + currentTime +
                ", feeder=" + feeder +
                ", feeding time=" + feedingTime +
                ", temperature=" + temperature +
                ", waterLevel=" + waterLevel +
                '}';
    }

    public void setFeedingTime(float feedingTime){
        this.feedingTime=feedingTime;
    }

    public void checkTemperature(){

        a.setValue(21);

        if(temperature<a.value){
            h.turnOn();
        } else if (temperature==a.getValue()) {
            h.turnOff();
        }
    }
    public void checkWaterLevel(){

        if(waterLevel<water.getValue()){
            alarm.turnOn();
        }
    }
}
