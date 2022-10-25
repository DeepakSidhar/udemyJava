import com.sun.security.jgss.GSSUtil;

public class Bed {

    private String Style;
    private int pillows;
    private int height;
    private int sheets;
    private int quilts;

    public Bed(String style, int pillows, int height, int sheets, int quilts) {
        Style = style;
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
        this.quilts = quilts;
    }

    public String getStyle() {
        return Style;
    }

    public int getPillows() {
        return pillows;
    }

    public int getHeight() {
        return height;
    }

    public int getSheets() {
        return sheets;
    }

    public int getQuilts() {
        return quilts;
    }

    public void make(){
        System.out.println("BED -> Making the bed");
    }

    //    private  double length;;
//    private double width;
//    private boolean isSingle;
//    private boolean isDouble;
//
//    public Bed(double length, double width){
//        if(length < 0){
//            this.length = 0;
//        }else {
//            this.length = length;
//        }
//        if(width < 0){
//            this.length = 0;
//        }else {
//            this.width = width;
//        }
//
//
//    }
//
//    public void getBed(double length, double width) {
//        if(length * width <= 20.00){
//            this.isSingle = true;
//            System.out.println("for the size of the bed you now have  a single bed "  );
//
//        } else {
//            this.isDouble = true;
//            System.out.println("for the size of the bed you now have  a double bed" );
//        }
//    }


}
