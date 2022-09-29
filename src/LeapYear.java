public class LeapYear {
    public static boolean isLeapYear(int year) {


        if (year >= 1 && year <= 9999) {
            //if (year % 2 == 0 && year % 100 != 0 || year % 400 == 0) {
            //    if ((year % 2 == 0) && (year % 100 == 0) && (year % 400 == 0))   {
            //            } else if (year % 100 == 0) {
            //                isLeapYear = true;
            //            } else if (year % 400 == 0) {
            //                isLeapYear = true;
            return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);



        }
        return false;
    }
}
