package arrays;
import java.util.Scanner;

//Print the elements of a user-entered array in reversed order
public class ReverseArray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int i, rev=0;
        System.out.print("Enter the size of array : ");
        int size = input.nextInt();
        System.out.print("Enter " + size + " elements of array : ");
        int[] array = new int[size];
        for(i=0; i<size; i++){
            array[i] = input.nextInt();
        }
        System.out.print("The elements of array in reversed order : ");
        for(i=size-1; i>=0; i--){
            rev = array[i];
            System.out.print(rev + " ");
        }
    }
}
