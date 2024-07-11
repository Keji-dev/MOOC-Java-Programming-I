
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Give points [0-100]:");
        int userNum = Integer.valueOf(scan.nextLine());
        
        if (userNum < 0) {
            System.out.println("Grade: Impossible!");
        } else if (userNum <= 49) {
            System.out.println("Grade: failed");
        } else if (userNum <= 59){
            System.out.println("Grade: 1");
        } else if (userNum <= 69) {
            System.out.println("Grade: 2");
        } else if (userNum <= 79) {
            System.out.println("Grade: 3");
        } else if (userNum <= 89) {
            System.out.println("Grade: 4");
        } else if (userNum <= 100) {
            System.out.println("Grade: 5");
        } else if (userNum > 100) {
            System.out.println("Grade: Incredible!");
        }
    }
}
