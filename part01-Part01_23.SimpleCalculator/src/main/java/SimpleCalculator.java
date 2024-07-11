
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int num1 = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Give the second number:");
        int num2 = Integer.valueOf(scanner.nextLine());
        
        int sumResult = (num1 + num2);
        int sumDifference = (num1 - num2);
        int sumProduct = (num1 * num2);
        double sumQuotient = (double) num1 / num2;
        
        System.out.println(num1 + " + " + num2 + " = " + sumResult);
        System.out.println(num1 + " - " + num2 + " = " + sumDifference);
        System.out.println(num1 + " * " + num2 + " = " + sumProduct);
        System.out.println(num1 + " / " + num2 + " = " + sumQuotient);
        

    }
}
