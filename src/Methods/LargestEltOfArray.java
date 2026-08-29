package Methods;
import java.util.Scanner;

//Print the largest element of a user-entered array using the method largest
public class LargestEltOfArray {
    public static int largest(int[] array){
        int greatest = array[0];
        for(int i=1; i<array.length; i++){
            if(array[i]>greatest){
                greatest = array[i];
            }
        }
        return greatest;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = input.nextInt();
        System.out.print("Enter " + size + " elements of the array : ");
        int[] array = new int[size];
        for(int i=0; i<size; i++){
            array[i] = input.nextInt();
        }
        int largestElement = largest(array);
        System.out.print("The largest element of the array is " + largestElement);
    }
}
