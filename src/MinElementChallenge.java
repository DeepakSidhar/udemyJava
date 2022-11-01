import java.util.Arrays;
import java.util.Scanner;

public class MinElementChallenge {
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please enter the count");
        int count = scan.nextInt();
        int[] userEnteredArray = readIntergers(count);
         int lowCount = findMin(userEnteredArray);

        System.out.println("the lowest value entered was " + lowCount);


        // System.out.println("the lowest value entered is : " + findMin(readIntergers(5)));
    }


    public static int[] readIntergers(int count){
        int[] userArray = new int[count];

        for(int i = 0; i < userArray.length; i++){
            System.out.println("Please enter a number " + i + "\r");
            userArray[i] = scan.nextInt();
        }
        return userArray;
    }

    public static int findMin(int[] array){
        int min = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }
}


