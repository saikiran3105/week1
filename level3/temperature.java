package level3;
import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the temperature in Fahrenheit: ");
        double fahrenheit = scan.nextDouble();
        scan.close();

        double celsiusResult = (fahrenheit - 32) * 5.0/9.0;

        System.out.println("The " + fahrenheit + " fahrenheit is " + celsiusResult + " celsius.");
    }
} 