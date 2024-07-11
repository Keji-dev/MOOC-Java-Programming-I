
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Which file should have its contents printed?");
        String input = scan.nextLine();
        
        try (Scanner scanPaths = new Scanner(Paths.get(input))) {
            
            while(scanPaths.hasNextLine()) {
                String row = scanPaths.nextLine();
                System.out.println(row);
            }
        
        } catch (Exception e) {
            System.out.println("Error");
        }

    }
}
