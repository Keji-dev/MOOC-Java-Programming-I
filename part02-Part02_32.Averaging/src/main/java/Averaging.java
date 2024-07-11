
public class Averaging {

    // implement the sum method here again
    public static double sum(double number1, double number2, double number3, double number4) {
        
        return number1 + number2 + number3 + number4;
    }

    public static double average(double number1, double number2, double number3, double number4) {
        double average = sum(number1, number2, number3, number4) / (double) 4;
        
        return average;
    }

    public static void main(String[] args) {
        
        double result = average(4, 3, 6, 1);
        System.out.println("Average: " + result);
    }
}
