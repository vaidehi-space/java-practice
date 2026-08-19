package conditionals;
import java.util.Scanner;

//Take an integer and print whether it is positive, negative or zero
public class PositiveOrNegative {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer to check whether it is positive, negative or zero : ");
        int number = input.nextInt();
        if(number>0){
            System.out.print(number + " is a positive number.");
        }
        else if(number==0){
            System.out.print(number + " is equal to zero.");
        }
        else{
            System.out.print(number + " is a negative number.");
        }
    }
}