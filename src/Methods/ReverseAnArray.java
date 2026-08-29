package Methods;
import java.util.Scanner;

//Print the elements of a user-entered array in reversed order using the method reversearray
public class ReverseAnArray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = input.nextInt();
        System.out.print("Enter " + size + " elements of the array : ");
        int[] array = new int[size];
        for(int i=0; i<size; i++){
            array[i] = input.nextInt();
        }
        reversearray(array);
    }

    public static void reversearray(int[] array){
        int reverse=0;
        System.out.print("The elements of array in reversed order : ");
        for(int i=array.length-1; i>=0; i--){
            reverse = array[i];
            System.out.print(reverse + " ");
        }
    }
}
