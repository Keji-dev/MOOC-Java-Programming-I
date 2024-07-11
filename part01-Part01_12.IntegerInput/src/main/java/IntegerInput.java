
import java.util.Scanner;

public class IntegerInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        String answer = scanner.nextLine();
        int answerToInteger = Integer.valueOf(answer);
        
        System.out.println("You gave the number " + answerToInteger);

    }
}
