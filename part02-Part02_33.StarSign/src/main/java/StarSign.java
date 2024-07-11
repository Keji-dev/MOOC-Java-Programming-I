
public class StarSign {

    public static void main(String[] args) {

        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!
        printStars(3);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        printRectangle(17, 3);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

    // Printing * with a line space
    public static void printStars(int number) {

        int i = 0;

        while (i < number) {
            System.out.print("*");
            i++;
        }
        System.out.println();
    }

    // Printing a square
    public static void printSquare(int size) {

        for (int s = 0; s < size; s++) {
            printStars(size);
        }

    }

    // Printing a rectangle
    public static void printRectangle(int width, int height) {

        for (int h = 0; h < height; h++) {
            printStars(width);
        }

    }

    //Printing a triangle
    
    public static void printTriangle(int size) {

        for (int a = 0; a <= size; a++) {
            printStars(a);
        }
    }
}
