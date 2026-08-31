package Strings;
import java.util.Scanner;

//Take a string as an input and print its length
public class LengthOfString {
    public static void main(String[] args){
        Scanner input =  new Scanner(System.in);
        System.out.print("Enter a string of characters : ");
        String enteredString = input.nextLine();
        System.out.print("The length of the string is " + enteredString.length() + " i.e. there are " + enteredString.length() + " characters in the entered string.");
    }
}
