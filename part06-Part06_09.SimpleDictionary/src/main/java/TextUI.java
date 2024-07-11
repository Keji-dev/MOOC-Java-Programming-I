import java.util.Scanner;
import java.util.ArrayList;

public class TextUI {
    
    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }
    
    public void start() {
        
        String commandInput = "";
        String addInput = "";
        String translationInput = "";
        
        while(true){
            System.out.println("Command:");
            commandInput = scanner.nextLine();
            
            if(commandInput.equals("end")) {
                System.out.println("Bye bye!");
                break;
            } 
            
            else if(commandInput.equals("add")) {
                System.out.println("Word: ");
                addInput = scanner.nextLine();
                System.out.println("Translation: ");
                translationInput = scanner.nextLine();
                dictionary.add(addInput, translationInput);
                System.out.println("Translation: " + dictionary.translate(addInput));
                continue;
            } 
            
            else if(commandInput.equals("search")) {
                System.out.println("To be translated: ");
                addInput = scanner.nextLine();
                if(dictionary.translate(addInput) == null) {
                    System.out.println("Word " + addInput + " was not found");
                } else {
                    System.out.println("Translation: " + dictionary.translate(addInput));
                }
                break;
            } 
            
            else {
                System.out.println("Unknown command");
            }
        }
    }
    
    
    
}
