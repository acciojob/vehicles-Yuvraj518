package com.driver;

public class Boat implements WaterVehicle{
    private String name;
//    private int currentSpeed=0;
//    private int currentdirection=0;
    private int capacity;

    public Boat(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

//    public void move(int speed, int direction){
//        currentSpeed=speed;
//        currentdirection=direction;
//        return;
//    }
//    public void steer(int direction){
//        currentdirection+=direction;
//        return;
//    }
//    public void stop(){
//        currentSpeed=0;
//        return;
//    }
    @Override
    public String getVehicleName() {
        return name;
    }
    @Override
    public int getVehicleCapacity(){
        return capacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
