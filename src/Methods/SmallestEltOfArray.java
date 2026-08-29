package Methods;
import java.util.Scanner;

//Print the smallest element of a user-entered array using the method smallest
public class SmallestEltOfArray {
    public static int smallest(int array[]) {
        int tiniest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (tiniest > array[i]) {
                tiniest = array[i];
            }
        }
        return tiniest;
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
        int smallestElement = smallest(array);
        System.out.print("The smallest element of the array is " + smallestElement);
    }
}