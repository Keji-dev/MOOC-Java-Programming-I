
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        SimpleDictionary dictionary = new SimpleDictionary();
        Scanner scanner = new Scanner(System.in);
        TextUI ui = new TextUI(scanner, dictionary);
        
        ui.start();
        
        System.out.println(dictionary.translate("pike"));
        
        
        
    }
}
