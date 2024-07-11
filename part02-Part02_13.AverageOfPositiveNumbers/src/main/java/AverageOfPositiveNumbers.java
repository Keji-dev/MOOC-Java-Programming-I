
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double averageOfPositives = 0;
        double sum = 0;

        double num = scanner.nextDouble();

        while (num != 0) {

            if (num > 0) {
                sum += num;
                averageOfPositives++;
            }
            num = scanner.nextDouble();
        }
        double totalAverage = sum / averageOfPositives;

        if (averageOfPositives == 0) {
            System.out.println("Cannot calculate the average");;
        } else {
            System.out.println(totalAverage);
        }

    }
}
