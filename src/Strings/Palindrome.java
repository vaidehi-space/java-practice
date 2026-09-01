package Strings;
import java.util.Scanner;

//Print whether a user-entered string is a Palindrome or not
public class Palindrome {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string of characters (without special characters) : ");
        String enteredString = input.nextLine();
        boolean palindrome = false;
        int length = enteredString.length();
        for(int i=0; i<length/2; i++){
            if(enteredString.charAt(i) != ' '){
                if(enteredString.charAt(i)==enteredString.charAt(length-1-i)){
                        palindrome = true;
                }
            }
        }
        if(palindrome){
            System.out.print(enteredString + " is a palindrome.");
        }
        else{
            System.out.print(enteredString + " is not a palindrome.");
        }
    }
}
