package com.bigJavaExercises.Chapter3Exercises;

class RoachPopulation {
    public int roaches;


    public RoachPopulation(int roachAmount) {
        this.roaches = roachAmount;
    }
    public void breed() {
        roaches = roaches * 2;
    }
    public void spray() {
        roaches = roaches - roaches/10 ;
    }
    public int getRoaches() {
        return roaches;
    }
}

public class RoachSimulation {
    public static void main(String[] args) {
        RoachPopulation roachPopulation = new RoachPopulation(10);
        roachPopulation.breed();
        roachPopulation.spray();
        System.out.println("new amount of roaches in the populaton is: " + roachPopulation.getRoaches());
    }
}
