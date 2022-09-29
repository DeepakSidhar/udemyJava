import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double a, double b){

        double x = Math.round(a *1000);

        double y = Math.round(b* 1000);

        System.out.println(x);
        System.out.println(y);
//        DecimalFormat df = new DecimalFormat("0.000");
//        System.out.println(df.format(a));
//        System.out.println(df.format(b));


//        DecimalFormat df = new DecimalFormat("#.###");
//      //  df.setRoundingMode(RoundingMode.FLOOR);
//        System.out.println(df.format(a));
//        System.out.println(df.format(b));


//        a = (double) Math.round(a * 100) / 100 / 100;;
//        b = (double) Math.round(b * 100) / 100 / 100 ;;
//
//       // System.out.printf("Value with 3 digits after decimal point %.3f %n", Math.round(a));
//       // System.out.printf("Value with 3 digits after decimal point %.3f %n", Math.round(b));
//        System.out.println("Value with 3 digits after decimal point " + a);
//        System.out.println("Value with 3 digits after decimal point " + b);
//        System.out.println("------------------------------------------------");
//        System.out.format("%.3f", a);
//        System.out.println("------------------------------------------------");
//        System.out.format("%.3f", b);

        boolean isEquale = false;
        if(a == b){
            isEquale = true;

        }
        return  isEquale;

    }
}
