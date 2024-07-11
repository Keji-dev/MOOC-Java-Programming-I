
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of the gift?");
        int value = Integer.valueOf(scan.nextLine());
        int valueGift = 5000;
        int valueGift25000 = 25000;
        int valueGift55000 = 55000;
        int valueGift200000 = 200000;
        int valueGift1000000 = 1000000;

        double tax = 0.08;
        double tax10 = 0.1;
        double tax12 = 0.12;
        double tax15 = 0.15;
        double tax17 = 0.17;

        double taxTotal = 100 + (value - valueGift) * tax;
        double taxTotal25K = 1700 + (value - valueGift25000) * tax10; 
        double taxTotal55K = 4700 + (value - valueGift55000) * tax12;
        double taxTotal200K = 22100 + (value - valueGift200000) * tax15;
        double taxTotal1000K = 142100 + (value - valueGift1000000) * tax17;

        if (value < 5000) {
            System.out.println("No tax!");
        } else if (value <= 25000) {
            System.out.println("Tax: " + taxTotal);
        } else if (value <= 55000) {
            System.out.println("Tax: " + taxTotal25K);
        } else if (value <= 200000) {
            System.out.println("Tax: " + taxTotal55K);
        } else if (value <= 1000000) {
            System.out.println("Tax: " + taxTotal200K);
        } else if (value > 1000000) {
            System.out.println("Tax: " + taxTotal1000K);
        } 

    }
}
