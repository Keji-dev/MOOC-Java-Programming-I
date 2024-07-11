
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give numbers:");
        int number = 0;
        int sum = number;
        int numbersOfNumbers = 0;
        double average = 0;
        int even = 0;
        int odd = 0;
        
        while (true){
            number = Integer.valueOf(scanner.nextLine());
            
           // average = ((double) number) / numbersOfNumbers ;
            
            if (number == -1){
                break;
            }
            if (number % 2 == 0 ) {
                even++;
            } else {
                odd++;
            }
            
            sum += number; 
            numbersOfNumbers++;
                 
        }
        average = ((double) sum) / numbersOfNumbers ;
    
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + numbersOfNumbers);
        System.out.println("Average: " + average);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
