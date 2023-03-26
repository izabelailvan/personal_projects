package aut.isp.lab4.exercise6;

public class FishFeeder {
    private int meals;
    private String manufactured;
    private String model;

    public FishFeeder(String manufactured, String models, int meals){
        this.meals=meals;
    }

    public void feed(){

        if(meals>0) {

            System.out.println("I just feed a fish");
            meals=meals-1;
            System.out.println("There are " + meals + " meals left");
        }
        else
            System.out.println("The fish feeder is empty");
    }

    public void fillUp(){
        if(meals<=0){
            meals=14;
            System.out.println("The fish feeder is filled up");
        }

    }

    @Override
    public String toString(){
        return "fishFeeder{" +
                "manufactured=" + manufactured +
                ", model=" + model +
                ", meals='" + meals + '\'' +
                '}';
    }
}
