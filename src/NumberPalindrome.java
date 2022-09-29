public class NumberPalindrome {
    public static boolean isPalindrome(int number){
        if (number < 0){
            number = -number;
        }

        int num = number;
        int lastDigit = 0;
        int reverse = 0;

        while(number > 0){
            lastDigit = number % 10;
            reverse =  reverse * 10 + lastDigit;;
            number = number / 10;
        }

        return num == reverse;





    }
}
