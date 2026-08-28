package arrays;
import java.util.Scanner;

//Print how many times a particular element occurs in a user-entered array
public class OccurrenceOfElement {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int i;
        System.out.print("Enter the size of array : ");
        int size = input.nextInt();
        System.out.print("Enter " + size + " elements of the array (integers only) : ");
        int[] array = new int[size];
        for(i=0; i<size; i++){
            array[i] = input.nextInt();
        }
        System.out.print("Enter the element you want to check occurrence of : ");
        int target = input.nextInt();
        int count = 0;
        for(i=0; i<size; i++){
            if(array[i]==target){
                count++;
            }
        }
        System.out.print(target + " occurred " + count + " times in the array.");
    }
}
