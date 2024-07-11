import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    private Scanner scan;
    private Average average;

    public UserInterface(Average average) {
        this.average = average;
        scan = new Scanner(System.in);
    }

    public void start() {

        int input;

        while (true) {


            System.out.println("Enter point totals, -1 stops:");
            input = scan.nextInt();

            if (input == -1) {
                break;
            }

            if (input > 0 && input <= 100) {
                average.addNumber(input);
            }

        }
    }

}
