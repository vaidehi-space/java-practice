package conditionals;
import java.util.Scanner;

//Take three numbers and print the largest of the three
public class LargestOfThree {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int number1 = input.nextInt();
        System.out.print("Enter the second number : ");
        int number2 = input.nextInt();
        System.out.print("Enter the third number : ");
        int number3 = input.nextInt();
        if(number1>number2){
            if(number1>number3){
                System.out.print(number1 + " is the largest number.");
            }
            else{
                System.out.print(number3 + " is the largest number.");
            }
        }
        else{
            if(number2>number3){
                System.out.print(number2 + " is the largest number.");
            }
            else{
                System.out.print(number3 + " is the largest number.");
            }
        }
    }
}
