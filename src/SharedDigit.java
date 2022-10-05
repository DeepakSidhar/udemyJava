public class SharedDigit {
    public static boolean hasSharedDigit(int a, int b){
        int aFirst = 0;
        int aLast = 0;
        int bFirst = 0;
        int bLast = 0;;
        if ((a <10 || a > 99) || (b < 10 || b >99)){
            return false;

        }else {
            while (a !=0){
                aLast = a % 10;
                aFirst =a/10;
                a %= 10;
                a /=10;


            }
            while (b !=0){
                bLast = b % 10;
                bFirst =b/10;
                b %= 10;
                b /=10;

            }

        }
        if((aFirst == bFirst)|| (aFirst == bLast)||(aLast == bFirst)|| (aLast == bLast)){
            return true;

        }
        return false;
    }
}
