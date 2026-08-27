package arrays;
import java.util.Scanner;

//Print the even and odd elements present in the user-entered array
public class EvenOddElements {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int i;
        System.out.print("Enter the size of array : ");
        int size = input.nextInt();
        System.out.print("Enter " + size + " elements of the array (only integers) : ");
        int[] array = new int[size];
        for(i=0; i<size; i++){
            array[i] = input.nextInt();
        }
        System.out.print("Even elements present in the array are : ");
        for(i=0; i<size; i++){
            if(array[i]%2==0){
                System.out.print(array[i] + " ");
            }
        }
        System.out.println(" ");
        System.out.print("Odd elements present in the array are : ");
        for(i=0; i<size; i++){
            if(array[i]%2!=0){
                System.out.print(array[i] + " ");
            }
        }
    }
}
