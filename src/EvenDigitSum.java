public class EvenDigitSum {
    public static int getEvenDigitSum(int number){
        int total = 0;
        int lastDigit =0;
        int nextDigit =0;
        if(number < 0){
            return -1;
        }else {

            while(number != 0){
                 lastDigit = number % 10;
                 if(lastDigit % 2 == 0){
                     total +=lastDigit;

                 }
                number /= 10;

            }
        }
        return  total;
    }
}
