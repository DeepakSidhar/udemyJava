public class Printer {

    private int tonerLevel;
    private  int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if(tonerLevel >-1 && tonerLevel <=100){
            this.tonerLevel = tonerLevel;
        }else {
            this.tonerLevel = -1;
        }
        this.duplex = duplex;
        this.pagesPrinted= 0;
    }

    public int addToner(int tonerAmount){
        if(tonerAmount > 0 && tonerAmount <= 100){
            if(this.tonerLevel + tonerAmount > 100){
                return -1;
            }
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        }else {
            return -1;
        }
    }

    public int printPages(int pages){
        int pagesToPrint = pages;
        if(this.duplex){
            pagesToPrint = (pages / 2) + (pages % 2);
            System.out.println("Printing in duples mode");
        }
        this.pagesPrinted +=pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted(){
        return this.pagesPrinted;
    }
    //    private int toner = 100;
//    private  int pagesPrinted =0;
//    private boolean isDuples;
//
//    public Printer( int pages, boolean isDuples) {
//        if(toner > 0){
//            if(isDuples && this.toner >0){
//                pagesPrinted += pages/2;
//                this.toner -= 10;
//            }else if (!(isDuples) && (this.toner > 0)){
//                pagesPrinted += pages;
//                this.toner -=10;
//            } else{
//                System.out.println("There is an issue with ink or printer");
//            }
//        }
//
//
//
//
//
//
//    }
//
//    public void setToner(int ink){
//        if(ink <= 100 && this.toner <= 10){
//            this.toner += ink;
//        }else{
//            System.out.println("Ink has enough");
//        }
//    }
//
//    public int getToner(){
//        return  this.toner;
//    }
//
//    public void setPrint(int pages){
//        if (getToner() > 0 && isDuples){
//            pagesPrinted += pages/2;
//            this.toner -= 10;
//
//        } else if (getToner() > 0 && !isDuples) {
//            pagesPrinted += pages/2;
//            this.toner -= 10;
//        } else {
//            System.out.println("There is an issue with INK  Please fill up");
//        }
//    }
//
//    public int getPagesPrinted(){
//        return this.pagesPrinted;
//    }


}
