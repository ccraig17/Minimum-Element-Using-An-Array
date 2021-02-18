import java.util.Scanner;

public class MinimumElement {
    public static void main(String[] args) {// placed in this class to run the program instead of creating a "Main" file to run the Code.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of Elements: \r");
        int returnedNumber = readInteger();
        int[] myArray = readElements(returnedNumber);

        int minNumber = findMin(myArray);
        System.out.println("My Minimum number is: " + minNumber);

        scanner.close();
    }
    private static int readInteger(){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.nextLine();
        return number;
    }
    private static int[] readElements(int number){
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[number];
        for(int i =0; i<array.length; i+=1){
            System.out.println("Enter the numbers in the array: ");
            array[i]= scanner.nextInt();
            scanner.nextLine();
        }
        return array;
    }
    private static int findMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i += 1) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
}
