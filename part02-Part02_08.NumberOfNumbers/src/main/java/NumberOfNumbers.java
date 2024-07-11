
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int totalNumber = 0;
        
        while(true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            
            if (number == 0) {
                break;
            }
            if (number != 0) {
                totalNumber = totalNumber + 1;
                continue;
            }
        }
        System.out.println("Number of numbers: " + totalNumber);
    }
}
