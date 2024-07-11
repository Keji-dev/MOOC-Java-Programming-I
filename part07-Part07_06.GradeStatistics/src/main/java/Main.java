
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Average average = new Average();
        UserInterface ui = new UserInterface(average);
        
        ui.start();
        average.printGrades();
    }
}
