public class MoterCar {

    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public MoterCar(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public String startEngine(){
        return "car's engine is starting";
    }

    public String accelerate(){
        return "car is accelerating";
    }

    public String brake(){
        return "car is breaking";
    }

    public int getCylinders(){
        return  this.cylinders;
    }

    public String getName(){
        return  this.name;
    }
}

class Mitsubishi extends MoterCar {
    public Mitsubishi(int cylinder, String name){
        super(cylinder, name);
    }

    @Override
    public String startEngine() {
        return "Mitsubishi  is starting";
    }

    @Override
    public String accelerate() {
        return "Mitsubishi  is accelerate";
    }

    @Override
    public String brake() {
        return "Mitsubishi  is breaking";
    }
}

class Holden extends MoterCar {
    public Holden(int cylinder, String name){
        super(cylinder, name);
    }

    @Override
    public String startEngine() {
        return "Holden  is breaking";
    }

    @Override
    public String accelerate() {
        return "Holden  is accelerate";
    }

    @Override
    public String brake() {
        return "Holden  is breaking";
    }

}

class Ford extends MoterCar {
    public Ford(int cylinder, String name){
        super(cylinder, name);
    }

    @Override
    public String startEngine() {
        return "Ford  is starting";
    }

    @Override
    public String accelerate() {
        return "Ford  is accelerate";
    }

    @Override
    public String brake() {
        return "Ford  is breaking";
    }
}
