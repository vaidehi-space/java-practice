package basics;
import java.util.Scanner;

//Take user's age and print it.
public class PrintAge {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = input.nextInt();
        System.out.print("You are " + age + " years old.");
    }
}