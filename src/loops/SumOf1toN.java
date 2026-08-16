package loops;
import java.util.Scanner;

//Take a number and print the sum from 1 to N
public class SumOf1toN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to find sum of 1 to that number : ");
        int number = input.nextInt();
        int sum = 0;
        for (int i=1; i<=number; i++) {
            sum += i;
        }
        System.out.print("The sum of " + number + " is " + sum + ".");
    }
}
