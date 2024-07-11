
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    //    ArrayList<String> list = new ArrayList<>();
        String file = scanner.nextLine();
        
        try (Scanner scan = new Scanner(Paths.get(file))) {
             
            while(scan.hasNextLine()) {
                String row = scan.nextLine();
                
                String [] parts = row.split(",");
                String name = parts[0];
                int age = Integer.valueOf(parts[1]);
   
                System.out.println(name + "," + " age: " + age + " years");
            }
        
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }

    }
}
