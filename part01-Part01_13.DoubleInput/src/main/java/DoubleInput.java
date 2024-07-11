
import java.util.Scanner;

public class DoubleInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        String number = scanner.nextLine();
        double result = Double.valueOf(number);
        
        System.out.println("You gave the number " + number);

    }
}
