
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Last number?");
        int user = Integer.valueOf(scanner.nextLine());
        int start = 0;
        int sum = 0;

        for (int count = start; count <= user; count++){


            sum = start+=count;
            System.out.println(count);
        }

        System.out.println("The sum is " + sum);
    }
}
