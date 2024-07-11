import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        
       Scanner scan = new Scanner(System.in);
       ArrayList<Book> book = new ArrayList<>();
       
       while(true) {
           System.out.println("Title:");
           String title = scan.nextLine();
           
           if (title.isEmpty()) {
               break;
           }
           
           System.out.println("Pages:");
           int pages = Integer.valueOf(scan.nextLine());
           System.out.println("Publication year:");
           int year = Integer.valueOf(scan.nextLine());
           
           book.add(new Book(title, pages, year));
       }
       
        System.out.println("What information will be printed?");
        String answer = scan.nextLine();
        
        for (Book print : book) {
            if (answer.equals("everything")) {
                System.out.println(print.getTitle() + ", " + print.getPages() + " pages, " + print.getYear());
            } else if (answer.equals("name")) {
                System.out.println(print.getTitle());
            } 
        }

    }
}
