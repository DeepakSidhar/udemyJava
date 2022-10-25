public class Window {
    private double length;
    private double width;

    public Window(double length, double width){
        if(length < 0){
            this.length = 0;
        }else {
            this.length = length;
        }
        if(width < 0){
            this.length = 0;
        }else {
            this.width = width;
        }
    }

    public void getWindow(){
        System.out.println("The size of the window is " + this.width * this.length);
    }
}
