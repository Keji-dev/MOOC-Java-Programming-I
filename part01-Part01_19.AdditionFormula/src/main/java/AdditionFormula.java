
import java.util.Scanner;

public class AdditionFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int num1 = scanner.nextInt();
        
        System.out.println("Give the second number:");
        int num2 = scanner.nextInt();
        int result = (num1 + num2);
        
        System.out.println(num1 + " + " + num2 + " = " + result);

    }
}
