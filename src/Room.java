public class Room {
    private  double length;;
    private double width;
    private Bed bed;
    private Window window;

    public Room(double length, double width, Bed bed, Window window) {
        this.length = length;
        this.width = width;
        this.bed = bed;
        this.window = window;
    }

    public Bed getBed() {
        return bed;
    }

    public Window getWindow() {
        return window;
    }
}
