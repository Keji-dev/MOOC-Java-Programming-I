import java.util.ArrayList;
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> first = new ArrayList<>();
        ArrayList<Integer> second = new ArrayList<>();

        int sum = 0;
        int move = 0;

        while (true) {
            System.out.print("First: " + sum + "/100");
            System.out.println();
            System.out.println("Second: " + move +"/100");
            String input = scan.nextLine();
            
            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");

            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            //Adding amount to the first container
            
            if (command.equals("add")) {
                
                if (amount < 0) {
                    amount = 0;
                }
                
                sum += amount;
                
                if (sum >= 100 || amount >= 100) {
                    sum = 100;
                } else if (sum <= 0) {
                    sum = 0;
                }
                
                first.add(amount);
            }
            
            //Moving amount to the second container
            
            if (command.equals("move")) {
                
                if(first.isEmpty()) {
                    move = 0;
                    amount = 0;
                }

                if (amount >= sum) {
                    amount = sum;
                    sum = 0;
                }

                if (sum >= move) {
                    sum -= amount;
                    move += amount;
                }
                
                if (amount < 0) {
                    move = 0;
                }

                if (amount >= 100) {
                    move = 100;
                }
                
                if (move >= 100) {
                    move = 100;
                }
                
                if (move <= 0) {
                    move = 0;
                }

                second.add(move);
            }    
                
            //Removing amount from the second container
            
            if (command.equals("remove")) {
                move -= amount;
               
                if (move >= 100) {
                    move = 100;
                } else if (move <= 0) {
                    move = 0;
                }
            }

        }
        
    }

}
