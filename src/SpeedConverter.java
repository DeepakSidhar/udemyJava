public class SpeedConverter {

    public  static long toMilesPerHour( double KilometersPerHour){
        if (KilometersPerHour < 0){
            return -1;
        }
        return Math.round(KilometersPerHour / 1.609);
    }

    public static void printConversion(double KilometersPerHour){
        if (KilometersPerHour < 0){
            System.out.println("Invalid Value");
        }else {
            long milesPerHour = toMilesPerHour(KilometersPerHour);
            System.out.println(KilometersPerHour + " km/h= " + milesPerHour + " mi/h ");

        }


    }






}
