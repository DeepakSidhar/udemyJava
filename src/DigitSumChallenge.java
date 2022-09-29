public class DigitSumChallenge {
    public static int  sumDigits(int number){
        int total = 0  ;
        int digit = 0;

        if (!(number >= 10)){
            return -1;
        }
        while(number > 0) {
            digit = number % 10; // 1
            total += digit;
            number = number / 10;
        }




            return total ;

    }
}
