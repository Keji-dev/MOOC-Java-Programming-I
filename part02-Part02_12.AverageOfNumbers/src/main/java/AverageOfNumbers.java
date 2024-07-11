
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double sum = 0;
        double averageNum = 0;
        double averageTotal = 0;
        
        while (true) {
            System.out.println("Give a number:");
            int num = scanner.nextInt();
            
            if (num == 0) {
                break;
            } else if (num != 0) {
                sum = num + sum ;
                averageNum = averageNum + 1;
                averageTotal = sum / averageNum;
            }
        }
        
        System.out.println("Average of the numbers: " + averageTotal);
    }
}
