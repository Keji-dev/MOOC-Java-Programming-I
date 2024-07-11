
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = 0;
        int end = scanner.nextInt();
        
        for (int count = start; count <= end; count++) {
            System.out.println(count);
        }
    }
}
