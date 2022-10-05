public class LastDigitChecker {
    public static boolean hasSameLastDigit(int a, int b, int c) {
        int first = 0;
        int second = 0;
        int third = 0;
        if ((a < 10 || a > 1000) || (b < 10 || b > 1000) || (c < 10 || c > 1000)) {
            return false;

        } else {
            first = a % 10;
            second = b % 10;
            third = c % 10;

            }
        if ((first == second)||(first == third)|| (second==third)){
            return true;


        } else
            return  false;

    }

    public static boolean isValid( int x){
        if (x < 10 || x >1000) {
            return false;

        } else {
            return true;
        }

    }
}