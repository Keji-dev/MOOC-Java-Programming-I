
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give a number:");
        int number = scanner.nextInt();
        int result = 1;
       
        for (int count = result; count <= number; count++) {
            
            result *= count; // result = result * count
        }
        
        System.out.println("Factorial: " + result);
    }
}
