public class SumOddRange {

    public static boolean isOdd(int number) {
        if (!(number > 0)) {
            return false;
        } else if (number % 2 == 0) {
            return false;
        } else
            return true;
    }

    public static int sumOdd(int start, int end) {
        int sum = 0;
        if ((start >= 0) && (end >= 0)) {
            if (end >= start) {
                for (int i = start; i <= end; i++) {
                    if (isOdd(i)) {
                        sum += i;
                    }
                }
                return sum;
            }
            return -1;
        } else
            return -1;




    }
}
