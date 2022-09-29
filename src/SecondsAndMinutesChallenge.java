public class SecondsAndMinutesChallenge {
    private static final String INVALID_VALUE_MESSAGE =  "Invalid Value";
    public static String getDurationString(int min, int sec){
        if((min > 0) || (sec >=0 || sec <=59)){
            int hour = min / 60 ;
            int mins = min % 60;

            String  hoursString = hour + "h";
            if (hour < 10){
                hoursString = "0" + hoursString;
            }
            String  minString = mins + "m";
            if (mins < 10){
                minString = "0" + minString;
            }

            String  secString = sec+ "s";
            if (sec < 10){
                secString = "0" + secString;
            }

            return hoursString + " " + minString  + " " + secString + " ";



        }
           // return "invalid Value ";
        return INVALID_VALUE_MESSAGE;

    }

    public static String getDurationString(int sec){

        if(sec > 0){
            int min = sec / 60;
            int seconds = sec % 60;
            return getDurationString(min, seconds);
        }
      //  return "invalid Value ";
        return INVALID_VALUE_MESSAGE;

    }
}
