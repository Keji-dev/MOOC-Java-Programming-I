
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lowest = 0;
        int oldest = 0;
        String name = "";

        while (true) {
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }
            
            String[] pieces = input.split(",");
            
            lowest = Integer.valueOf(pieces[1]);
            
            if (oldest < lowest) {
                oldest = lowest;
                name = pieces[0];
            }
            
     //       name = String.valueOf(pieces[oldest]);
            
        }
        
        System.out.println("Name of the oldest: " + name);
    }
}
