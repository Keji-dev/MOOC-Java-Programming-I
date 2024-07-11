
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        
        while (!input.isEmpty()) {
            String[] spaces = input.split(" ");
            
            for (String s : spaces) {
                
                if (s.contains("av")) {
                System.out.println(s);
                }
            
            }
            
            
  
            input = scanner.nextLine();
        }

    }
}
