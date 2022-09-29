public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes){
        long XX = (minutes%(365*24*60)) % 60; // gives me hours
        long ZZ = (minutes%(365*24*60))/(24*60); // gives me days
        long YY = minutes /(365*24*60);; // years;

        if(minutes < 0){
            System.out.println("Invalid Value");
        }else {
            System.out.println(minutes + " min = " + YY + " y and " + ZZ + " d"  );
      }

    }
}
/**
 * Be extra careful about spaces in the printed message.
 *
 * Use the remainder operator
 *
 * 1 hour = 60 minutes
 *
 * 1 day = 24 hours
 *
 * 1 year = 365 days
 *
 * NOTES
 */