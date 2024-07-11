import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserInterface {
    
    private TodoList list;
    private Scanner scanner = new Scanner(System.in);

    public UserInterface(TodoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }

    public void start() {

        String input;
        String commandString;
        int inputNumber;
        int numberOfCommands = 4;
        boolean shouldLoop = true;
        
        
        while(shouldLoop) {
            System.out.println("Command: ");
            input = scanner.nextLine();
            
            switch (input) {
                
                case "stop":
                    System.out.println("bye bye");
                    shouldLoop = false;
                    break;
                
                case "add":
                    System.out.println("To add");
                    input = scanner.nextLine();
                    list.add(input);
                    continue;
                    
                case "list":
                    list.print();
                    continue;
                    
                case "remove":
                    System.out.println("Which one is removed?");
                    inputNumber = Integer.valueOf(scanner.nextLine());
                    list.remove(inputNumber);
                    continue;
            }
            
        }
    }
    
    
    
}
