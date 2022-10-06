import java.util.Scanner;

public class ReadingUserInputChallenge {

    public static int readChallenge() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number # ");
        boolean hasNextInt = scan.hasNextInt();
        int counter = 1;
        int total = 0;
        if (hasNextInt){
            while (counter <= 10) {
                System.out.println("Enter number # " + counter);
                total += scan.nextInt();
                counter ++;
            }
        }else {
            System.out.println("Invalid number");
        }
        scan.close();
        return total;


//        Scanner scan = new Scanner(System.in);
//        int total = 0;
//        int counter = 1;
//        while (counter <= 10) {
//            System.out.println("Enter number # " + counter);
//            boolean hasNextInt = scan.hasNextInt();
//            if (hasNextInt) {
//                total += scan.nextInt();
//                counter ++;
//
//
//            }else {
//                System.out.println("Invalid number");
//                while (hasNextInt){
//                    System.out.println("Enter number # " + counter);
//
//                }
//            }
//
//        }
//        scan.close();
//        return total;



    }




}
