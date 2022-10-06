public class LargestPrime {
    public static int getLargestPrime(int number){
        int start = 1;
        int highPrime =0;
        if(number <=0){
            return -1;
        } else {
            while (start < number){
                if(number % start == 0){
                    highPrime = start;
                    start ++;
                }else {
                    start ++;
                }



            }
        }
        return highPrime;

    }
}
