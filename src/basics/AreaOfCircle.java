package basics;
import java.util.Scanner;

//Take radius of a circle in cm and print its area in m
public class AreaOfCircle {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of circle in cms : ");
        float radius = input.nextFloat();
        float areaOfCircle = (float)(3.14 * radius * radius * 0.01);
        System.out.print("The area of circle with radius " + radius + " cm is " + areaOfCircle + " m sq.");
    }
}
