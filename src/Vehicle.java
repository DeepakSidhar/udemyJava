
// Challenge.
// Start with a base class of a Vehicle, then create a Car class that inherits from this base class.

// Finally, create another class, a specific type of Car that inherits from the Car class.

// You should be able to hand steering, changing gears, and moving (speed in other words).
// You will want to decide where to put the appropriate state and behaviours (fields and methods).
// As mentioned above, changing gears, increasing/decreasing speed should be included.

// For you specific type of vehicle you will want to add something specific for that type of car.

import java.sql.SQLOutput;

public class Vehicle {
   private int size;
   private String name;
   private boolean hasfuel;
   private int speed;
   private String steer;


   public Vehicle(int size, String name, boolean hasfuel){
       this.size = size;
       this.name = name;
       this.hasfuel = hasfuel;
       this.speed = 0;
       this.steer = "Stop";
   }

   public void move(int speed){
       this.speed = speed;
       System.out.println("The Vehicle is moving  at " + this.speed) ;
   }



   public void steer(String direction){
       this.steer = direction;
       System.out.println("The Direction of the Vehical is " + this.steer);
   }
   public void stop(){
       this.speed = 0;
   }


   ///
    // Generate Setters and getters not sure what for !!!  but need to get and set values


    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHasfuel() {
        return hasfuel;
    }

    public void setHasfuel(boolean hasfuel) {
        this.hasfuel = hasfuel;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
//        if(this.speed == 0){
//            System.out.println("The car has stopped.");
//        }else {
//            this.speed = speed;
//        }
    }

    public String getSteer() {
        return steer;
    }

    public void setSteer(String steer) {
        this.steer = steer;
    }
}
