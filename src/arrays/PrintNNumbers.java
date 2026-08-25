package arrays;
import java.util.Scanner;

//Take N numbers of elements in an array and print them
public class PrintNNumbers {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int i;
        System.out.print("Enter the size of array : ");
        int size = input.nextInt();
        int[] array = new int[size];
        System.out.print("Enter " + size + " elements of the array (only integers) : ");
        for(i=0; i<size; i++){
            array[i] = input.nextInt();
        }
        System.out.print("The elements of the array are : ");
        i = 0;
        for(i=0; i<size; i++){
            System.out.print(array[i] + " ");
        }
    }
}
