public class Wall {
    //||
    private double width;
    private double height;

    public Wall() {

    }

    public Wall(double width, double height) {
        this.width = width;
        this.height = height;

        if (this.width < 0 ) {
            this.width = 0;
        } else {
            this.width = width;

        }
        if (this.height < 0 ) {
            this.height = 0;
        } else {
            this.height = height;

        }
//        if(width > 0 &&  height > 0 ){
//            this.width = width;
//            this.height = height;
//        }else if( width < 0 &&   height > 0){
//            this.width = 0;
//            this.height = height;
//        } else if (height < 0 &&   width > 0) {
//            this.height = 0;
//            this.width = width;
//        }else if (height < 0 &&   width < 0) {
//            this.height = 0;
//            this.width = 0;
//        }
//
//
//        System.out.println("Height is " + this.height);
//        System.out.println("width is " + this.width);



    }



    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setWidth(double width) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }

    public void setHeight(double height) {
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    public double getArea(){
        return this.height * this.width;
    }

}
