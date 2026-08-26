package arrays;
import java.util.Scanner;

//Print the second-largest element of a user-entered array
public class SecondLargestElement{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i;
        System.out.print("Enter the size of array (more than 2) : ");
        int size = input.nextInt();
        System.out.print("Enter " + size + " elements of the array (only integers) : ");
        int[] array = new int[size];
        for (i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        int largest = array[0], secondLargest = array[0];
        for (i = 1; i < size; i++) {
            if (array[i] > largest) {
                secondLargest = largest;
                largest = array[i];
            } else if (((array[i] > secondLargest) || (array[i] > largest)) && (secondLargest == array[0])) {
                secondLargest = array[0];
            }
        }
        System.out.print("The second-largest element of the array is " + secondLargest);
    }
}