package basics;
import java.util.Scanner;

//Take marks of three subjects and print their average
public class AverageCalculator {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter marks obtained in the first subject : ");
        int marksInFirst = input.nextInt();
        System.out.print("Enter marks obtained in the second subject : ");
        int marksInSecond = input.nextInt();
        System.out.print("Enter marks obtained in the third subject : ");
        int marksInThird = input.nextInt();
        float average = (float) (marksInFirst + marksInSecond + marksInThird) / 3;
        System.out.print("The average of your marks is " + average + ".");
    }
}
