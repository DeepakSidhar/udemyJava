import java.util.ListResourceBundle;

//public class GreatestCommonDivisor {
//    public static int getGreatestCommonDivisor(int first, int second) {
//        int firstNumber = 1;
//        int secondNumber = 1;
//        int firstRange =0;
//        int secondRange =0;
//        boolean IsTrue = true;
//        if ((first < 10) || (second < 10)) {
//            return -1;
//        } else {
//            while (firstNumber != first ) {
//                if(first % firstNumber == 0){
//                    firstRange + firstNumber
//                    firstNumber++;
//
//
//                }
//
//                }
//            while (number != second ) {
//                if(second % number == 0){
//                    firstValue += number;
//                    number++;
//
//
//                }
//            }
//
//
//
//            }
//            IsTrue = false;
//
//            return number;
//        }
//    }
public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second) {
        // 1 . first and second if they are < 10 return -1

        if(first < 10  || second < 10){
            return -1;
        }
        // 2.  need to find the min of the two and loop down to 0
        //int startingPoint = Math.min(first, second);
        int startingPoint = first;
            //2.1 first % potential soloution  == 0  and  second % potential soloution  == 0
        while (startingPoint > 0){ //solution space great than 1.
            if(first % startingPoint == 0 && second % startingPoint == 0 ){
                return startingPoint;
            }
                startingPoint --;


        }
        //3.  if no result return a -1

            return -1;



    }


}