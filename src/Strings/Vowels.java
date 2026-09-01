package Strings;
import java.util.Scanner;

//Output the vowels present in a user-entered string
public class Vowels {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string of characters : ");
        String enteredString = input.nextLine();
        int noneMessage = 0;
        int countofa = 0, countofe = 0, countofi = 0, countofo = 0, countofu = 0;
        for(int i=0; i<enteredString.length(); i++){
            if(enteredString.charAt(i) == 'a' || enteredString.charAt(i) == 'A'){
                countofa += 1;
            }
            else if(enteredString.charAt(i) == 'e' || enteredString.charAt(i) == 'E'){
                countofe += 1;
            }
            else if(enteredString.charAt(i) == 'i' || enteredString.charAt(i) == 'I'){
                countofi += 1;
            }
            else if(enteredString.charAt(i) == 'o' || enteredString.charAt(i) == 'O'){
                countofo += 1;
            }
            else if(enteredString.charAt(i) == 'u' || enteredString.charAt(i) == 'U'){
                countofu += 1;
            }
            else{
                noneMessage = 1;
            }
        }
        if(countofa>0){
            System.out.println("a is present in " + enteredString + " " + countofa + " times.");
        }
        if(countofe>0){
            System.out.println("e is present in " + enteredString + " " + countofe + " times.");
        }
        if(countofi>0){
            System.out.println("i is present in " + enteredString + " " + countofi + " times.");
        }
        if(countofo>0){
            System.out.println("o is present in " + enteredString + " " + countofo + " times.");
        }
        if(countofu>0){
            System.out.println("u is present in " + enteredString + " " + countofu + " times.");
        }
        if(noneMessage == 1){
            System.out.println("No vowel exists in " + enteredString + ".");
        }
    }
}