import java.util.Scanner;

public class SortedArray {
    public static void main(String[] args) {
        int[] array = getIntegers(5);
        int [] sortIntegers = sortIntegers(array);
        printArray(sortIntegers);


    }



    public static int[] getIntegers(int number){
        Scanner scan = new Scanner(System.in);
        int[] userArray = new int[number];
        for(int i = 0; i <userArray.length; i++){
            userArray[i] = scan.nextInt();
        }
        return userArray;
    }

    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array){
        int[] sortedArray = new int[array.length];
        for(int i =0; i <sortedArray.length; i++){
            sortedArray[i] = array[i];
        }
        int temp;
        boolean flag = true;
        while(flag){
            flag =  false;
            for(int i =0 ; i < sortedArray.length - 1; i++){
                if(sortedArray[i] < sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }


}


