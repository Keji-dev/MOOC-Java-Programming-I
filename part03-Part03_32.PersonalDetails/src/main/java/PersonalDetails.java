
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int longestName = 0;
        String name = "";
        double average = 0;
        int sum = 0;
        

        while (true) {
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }
            String[] pieces = input.split(",");
            
            
            int comparison = input.length();
            
            if (longestName < comparison) {
                longestName = comparison;
                name = pieces[0];
            }
            
            int years = Integer.valueOf(pieces[1]);
 
            sum += years;
            average++;
     
        }   
        
        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + (1.00 * sum / average));
    }
}
