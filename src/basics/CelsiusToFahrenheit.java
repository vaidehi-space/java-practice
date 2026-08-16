package basics;
import java.util.Scanner;

//Take temperature in degree Celsius, convert it into Fahrenheit and print it.
public class CelsiusToFahrenheit {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature in degree Celsius : ");
        float tempInCelsius = input.nextFloat();
        float tempInFahrenheit = (float) (tempInCelsius * 1.8) + 32;
        System.out.print(tempInCelsius + " C is " + tempInFahrenheit + " F.");
    }
}
