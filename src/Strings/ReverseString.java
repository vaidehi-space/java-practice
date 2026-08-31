package Strings;
import java.util.Scanner;

//Print a user-entered string in a reversed order
public class ReverseString {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string of characters : ");
        String enteredString =  input.nextLine();
        System.out.print("The string " + enteredString + " in the reversed order is : ");
        String reversedString = " ";
        for(int i=enteredString.length()-1; i>=0; i--){
            reversedString += enteredString.charAt(i);
        }
        System.out.print(reversedString);
    }
}
