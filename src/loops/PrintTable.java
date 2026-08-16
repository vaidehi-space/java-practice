package loops;
import java.util.Scanner;

//Take a number and print its multiplication table
public class PrintTable {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to print its multiplication table : ");
        int number = input.nextInt();
        System.out.println("Multiplication Table of " + number + " :");
        for (int i=number; i<=(number*10); i+=number){
            System.out.println(i);
        }
    }
}
