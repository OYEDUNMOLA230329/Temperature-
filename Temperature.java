
package temperature;
import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     
     System.out.print("Enter the Celsius");
     double celsius = scanner.nextDouble();
     double fahrenheit = (celsius * 9 / 5)+ 32;
     
     System.out.println("The Answer is:"+ fahrenheit);
            }
}
