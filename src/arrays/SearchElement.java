package arrays;
import java.util.Scanner;
import java.util.Arrays;

//Print whether a target element exists in the user-entered array or not
public class SearchElement {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int i;
        System.out.print("Enter the size of array : ");
        int size = input.nextInt();
        System.out.print("Enter " + size + " elements of the array : ");
        int[] array = new int[size];
        for(i=0; i<size; i++){
            array[i] = input.nextInt();
        }
        System.out.print("Enter the element you want to search : ");
        int target = input.nextInt();
        boolean exists = Arrays.stream(array).anyMatch(x -> x == target);
        System.out.print(exists? target + " exists in the array." : target + " does not exist in the array.");
    }
}
