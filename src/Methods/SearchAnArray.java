package Methods;
import java.util.Arrays;
import java.util.Scanner;

//Print whether a target element exists in the user-entered array or not using the method searchElement
public class SearchAnArray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = input.nextInt();
        System.out.print("Enter " + size + " elements of the array : ");
        int[] array = new int[size];
        for(int i=0; i<size; i++){
            array[i] = input.nextInt();
        }
        searchElement(array);
    }

    public static void searchElement(int[] array){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the element you want to search : ");
        int target = input.nextInt();
        boolean exists = Arrays.stream(array).anyMatch(x -> x == target);
        System.out.print(exists? target + " exists in the array." : target + " does not exist in the array.");
    }
}
