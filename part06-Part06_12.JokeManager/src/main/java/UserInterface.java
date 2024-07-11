import java.util.Scanner;

public class UserInterface {
    
    private JokeManager jokes;
    private Scanner scan = new Scanner(System.in);

    public UserInterface(JokeManager jokes, Scanner scan) {
        this.jokes = jokes;
        this.scan = scan;
    }
    
    
    public void start() {
        
        while (true) {
            String input = "";
        
            System.out.println("Commands:");
            System.out.println("1 - add a joke");
            System.out.println("2 - draw a joke");
            System.out.println("3 - list jokes");
            System.out.println("X - stop");
            input = scan.nextLine();
            
            if(input.equalsIgnoreCase("1")) {
                System.out.println("Write the joke to be added:");
                input = scan.nextLine();
                jokes.addJoke(input);
                continue;
            }
            
            else if (input.equalsIgnoreCase("2")) {
                System.out.println(jokes.drawJoke());
                continue;
            }
            
            else if (input.equalsIgnoreCase("3")) {
                jokes.printJokes();
                continue;
            }
            
            else if (input.equalsIgnoreCase("X")) {
                break;
            }
        }
        
    }
    
}
