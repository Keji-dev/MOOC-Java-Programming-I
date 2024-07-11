
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Give a year:");
        int year = Integer.valueOf(scan.nextLine());
        
        //Si el anio (1700) es divisible entre 4, tiene que pasar la siguiente condicion que sea divisible entre 100 (si que lo es) y que sea divisible entre 400 (no lo es) por lo tanto no es una anio bisiesto
        if (year % 4 != 0) {
            System.out.println("The year is not a leap year.");
        } else if (year % 100 == 0 && year % 400 != 0){
            System.out.println("The year is not a leap year.");
        } else {
            System.out.println("The year is a leap year.");
        } 
        
    }
}
