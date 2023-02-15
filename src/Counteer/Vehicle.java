package Counteer;

import java.util.ArrayList;

public class Vehicle {

    private String carBrand;
    private int speed, licensePlate;
    private ArrayList<Vehicle> howManyCars;

    Vehicle(String carBrand, int licensePlate, int speed) {
        this.carBrand = carBrand;
        this.licensePlate = licensePlate;
        this.speed = speed;
        howManyCars = new ArrayList<>();
    }


    public void addCar(Vehicle vehicle){
        howManyCars.add(vehicle);

    }

    public void showCars (){
        for (Vehicle vs : howManyCars){
            System.out.println(vs.toString());
        }
    }


    public int getSpeed() {
        return speed;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(int licensePlate) {
        this.licensePlate = licensePlate;
    }

    @Override
    public String toString() {
        return "Araba markasi:"+carBrand + " Plaka:" + licensePlate + " Hiz:"+ speed;
    }
}
