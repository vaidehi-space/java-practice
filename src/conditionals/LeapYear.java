package conditionals;
import java.util.Scanner;

//Take a year and print whether it is a leap year or not
public class LeapYear {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year to check whether it is a leap year or not : ");
        int year = input.nextInt();
        if(year%4==0){
            System.out.print(year + " is a leap year.");
        }
        else{
            System.out.print(year + " is not a leap year.");
        }
    }
}
