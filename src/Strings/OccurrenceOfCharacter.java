package Strings;
import java.util.Scanner;

//Print how many times a user-entered character occurs in a user-entered string
public class OccurrenceOfCharacter {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string of characters : ");
        String enteredString = input.nextLine();
        System.out.print("Enter the character you want to check the occurrence of (space excluded) : ");
        char target = input.next().charAt(0);
        int count = 0;
        for(int i=0; i<enteredString.length(); i++){
            if(enteredString.charAt(i) == target){
                count++;
            }
        }
        System.out.print(target + " occurs " + count + " times in " + enteredString);
    }
}
