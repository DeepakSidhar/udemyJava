public class Car extends Vehicle{
    private int wheels;
    private int gears;
    private int doors;
    private  boolean isManual;
    private int currentGear;


    public Car(int size, String name, boolean hasfuel, int wheels, int gears, int doors, boolean isManual ) {
        super(size, name, hasfuel);
        this.wheels = wheels;
        this.gears = gears;
        this.doors = doors;
        this.isManual = isManual;
        this.currentGear = 0; // when we create a car object it will be in stopped position.

    }

    public int getCurrentGear() {
        return currentGear;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("THe current gear is " + this.gears);
    }

    public void start(int speed, String direction){
        move(speed);
        steer(direction);
    }

    public void increaseSpeed(){
        System.out.println("increasing speed by 10 mph");
        setSpeed(10);
    }
    public void decreaseSpeed(){
        System.out.println("decrease speed  by 10 mph");
        setSpeed(-10);
    }

    public void reverse( ){
        steer("reverse");
    }

    public int getGears() {
        return gears;
    }

    public boolean isManual() {
        return isManual;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }
}
