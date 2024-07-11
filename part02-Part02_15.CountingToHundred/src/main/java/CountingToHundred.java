
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int start = scanner.nextInt();
        int end = 100;
        
        for (int count = start; count <= end; count++){
            System.out.println(count);
        }

    }
}
