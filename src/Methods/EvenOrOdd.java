package Methods;
import java.util.Scanner;

//Print the even and odd elements of a user-entered array using the method evenodd
public class EvenOrOdd{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = input.nextInt();
        System.out.print("Enter " + " elements of the array : ");
        int[] array = new int[size];
        for(int i=0; i<size; i++){
            array[i] = input.nextInt();
        }
        evenodd(array);
    }

    public static void evenodd(int[] array){
        System.out.print("Even elements are : ");
        for(int i=0; i<array.length; i++){
            if(array[i] % 2 == 0){
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
        System.out.print("Odd elements are : ");
        for(int i=0; i<array.length; i++){
            if(array[i] % 2 != 0){
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }
}