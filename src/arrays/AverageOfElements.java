package arrays;
import java.util.Scanner;

//Print the average of all the elements of array of the user-entered array
public class AverageOfElements {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int i, sum = 0;
        System.out.print("Enter the size of array : ");
        int size = input.nextInt();
        System.out.print("Enter " + size + " elements of the array (only integers) : ");
        int[] array = new int[size];
        for(i=0; i<size; i++){
            array[i] = input.nextInt();
        }
        for(i=0; i<size; i++){
            sum += array[i];
        }
        int average = sum/size;
        System.out.print("The average of elements of array is " + average);
    }
}
