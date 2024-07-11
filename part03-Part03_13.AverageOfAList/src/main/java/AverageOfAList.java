
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numList = new ArrayList<>();
        
        while (true) {
            int input = scanner.nextInt();
            if (input == -1) {
                break;
            }
            
            numList.add(input);
        }
        
        int sum = 0;
        double average = 0;
        
        for (int i = 0; i < numList.size(); i++) {
            sum = sum + numList.get(i); 
            average =  (double) sum / numList.size() ;
        }
        System.out.println("Average: " + average);
        
        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        
    }
}
