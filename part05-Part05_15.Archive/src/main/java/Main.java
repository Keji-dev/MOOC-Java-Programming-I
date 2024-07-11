import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String identifier, name;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> list = new ArrayList<>();

        while (true) {
            System.out.println("Indentifier? (empty will stop)");
            identifier = scanner.nextLine();

            if (identifier.isEmpty()) {
                break;
            }

            System.out.println("Name? (empty will stop)");
            name = scanner.nextLine();

            

            if(name.isEmpty()) {
                break;
            } 
            
            Item item = new Item(identifier, name);
            
            if (list.contains(item)) {
                continue;
            } else {
                list.add(item);
            }
        }

        System.out.println("==Items==");
        
        for (Item print : list) {
            System.out.println(print);
        }

    }
}