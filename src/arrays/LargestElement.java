package arrays;
import java.util.Scanner;

//Print the largest element of the user-entered array
public class LargestElement {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int i;
        System.out.print("Enter the size of array : ");
        int size = input.nextInt();
        System.out.print("Enter " + size + " elements of the array (only integers: ");
        int[] array = new int[size];
        for(i=0; i<size; i++){
            array[i] = input.nextInt();
        }
        int largest = array[0];
        for(i=0; i<size; i++){
            if(largest<array[i]){
                largest=array[i];
            }
        }
        System.out.print("The largest element of the array is " + largest);
        System.out.print(largest);
    }
}
