package arrays;
import java.util.Scanner;

//Print the sum of all elements of the user-entered array
public class SumOfElements {
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
        System.out.print("The sum of all elements of array is " + sum);
    }
}
