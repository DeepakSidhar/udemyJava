
public class Point {
    private int x;
    private int y;

    public Point(){

    }

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(){
        Point another = new Point(0 ,0);

        return distance(another);

    }

    public double distance(int x, int y){
        Point another = new Point(x ,y);

        return distance(another);

    }

    public double distance(Point anther){
        //This. x = this y  is  is equale to field  variables


        //another is refering to another of instance of point  x and y  using the class.

        // to access the  Point Another have to use the get  method as the filed is private.
        double dx = anther.getX() - this.x ;
        double dy = anther.getY() - this.y;

        // to cacaulate the  two points
        //To find a distance between points A(xA,yA) and B(xB,yB), we use the formula:
        //d(A,B)=√ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)
        //d(A,B)=√ dx * dx + dy * dy
        return Math.sqrt(dx * dx + dy * dy);

    }


}
