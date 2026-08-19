package conditionals;
import java.util.Scanner;

//Take two numbers and print the larger one
public class LargerOfTwo {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int number1 = input.nextInt();
        System.out.print("Enter the second number : ");
        int number2 = input.nextInt();
        if(number1>number2){
            System.out.print(number1 + " is larger than " + number2 + ".");
        }
        else{
            System.out.print(number2 + " is larger than " + number1 + ".");
        }
    }
}
