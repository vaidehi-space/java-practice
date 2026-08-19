package loops;
import java.util.Scanner;

//Take a number and print its reverse
public class Reverse {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to find its reverse : ");
        int number = input.nextInt();
        int remainder = 0, reverse = 0;
        for(int i=0; i<=number; i++){
           remainder = number % 10;
           reverse = (reverse * 10) + remainder;
           number = number / 10;
       }
        System.out.print("The reverse of " + number + " is " + reverse + ".");
    }
}