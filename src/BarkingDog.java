public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay ){
        boolean isAwake = false;
        if(hourOfDay > 23 || hourOfDay < 0){
            isAwake = false;
        } else if (hourOfDay >= 23 || (hourOfDay < 8)) {
            if (barking) {
                isAwake = true;
            }
        }
        return isAwake;
    }

}
