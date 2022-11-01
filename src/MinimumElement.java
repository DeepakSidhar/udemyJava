import java.util.Scanner;

public class MinimumElement {

    public static void main(String[] args) {
        int number = readInteger();
        int[] readElements = readElements(number);
        int lowNumber = findMin(readElements);
        System.out.println("lowNumber " + lowNumber);
    }

  //  private static Scanner scan = new Scanner(System.in);






    private static int readInteger(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the to total elements needed");
        int count = scan.nextInt();
        return count;
    }

    private static int[] readElements(int number){
        Scanner scan = new Scanner(System.in);
        int[] userArray = new int[number];
        for(int i = 0; i <userArray.length; i++){
            System.out.println("Please enter a number for postion " + i);
            userArray[i] = scan.nextInt();
        }
        return  userArray;
    }

    private static int findMin(int[] array){
        int min = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }
}
