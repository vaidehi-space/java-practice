package basics;
import java.util.Scanner;

//Take two numbers and print their sum, difference, product, division, remainder, etc.
public class Calculator {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int number1 = input.nextInt();
        System.out.print("Enter the second number : ");
        int number2 = input.nextInt();
        System.out.println("The sum of " + number1 + " and " + number2 + " is " + (number1 + number2) + ".");
        System.out.println("The difference between " + number1 + " and " + number2 + " is " + (number1 - number2) + ".");
        System.out.println("The product of " + number1 + " and " + number2 + " is " + (number1 * number2) + ".");
        System.out.println(number1 + " when divided by " + number2 + " gives the quotient " + (number1 / number2) + ".");
        System.out.println(number1 + " when divided by " + number2 + " gives the remainder " + (number1 % number2) + ".");
        System.out.print(number1 + " raised to the power " + number2 + " is " + ((int) (Math.pow(number1,number2))) + ".");
    }
}
