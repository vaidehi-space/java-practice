package conditionals;
import java.util.Scanner;

//Take a number and print whether it is even or odd
public class EvenOdd {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to check whether it is even or odd : ");
        int number = input.nextInt();
        if(number%2==0){
            System.out.print(number + " is an even number.");
        }
        else{
            System.out.print(number + " is an odd number.");
        }
    }
}
