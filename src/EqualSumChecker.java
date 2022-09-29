public class EqualSumChecker {
    public static boolean hasEqualSum(int a, int b, int c){
        boolean isSumEquale = false;
        int total = a + b;
        if(total == c ){
            isSumEquale = true;
        }
        return isSumEquale;
    }
}
