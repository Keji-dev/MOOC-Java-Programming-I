import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private ArrayList<Birds> birds;

    public UserInterface() {
        this.scanner = new Scanner(System.in);
        birds = new ArrayList<>();
    }

    public void start() {

        while (true) {
            menu();
            String input = scanner.nextLine().toLowerCase();

            switch (input) {

                case "add":
                    addBird();
                    break;

                case "all":
                    printBirds();
                    break;

                case "observation":
                    addObservation();
                    break;

                case "one":
                    printOneBird();
                    break;

                case "quit":
                    return;
            }
        }

    }

    public void menu() {
        System.out.println("Commands:");
        System.out.println("Add - adds a bird");
        System.out.println("Observation - adds an observation");
        System.out.println("All - prints all birds");
        System.out.println("One - prints one bird");
        System.out.println("Quit - ends the program\n");
    }

    // Metodo para agregar un ave a nuestra ArrayList
    public void addBird() {
        System.out.println("Name:");
        String birdName = scanner.nextLine();
        System.out.println("Name in Latin:");
        String birdLatinName = scanner.nextLine(); // Deberia ponerse to lowerCase? Veremos luego cuando intentemso buscarla
        System.out.println();
        Birds bird = new Birds(birdName, birdLatinName, 0); // Creamos una nueva ave con nombre, nombre en latin y su contador de observaciones a 0
        birds.add(bird); // Agregamos el ave creada a la lista de nuestras aves
    }

    // Metodo para agregar al contador de observation
    public void addObservation() {
        System.out.println("Bird?");
        String birdName = scanner.nextLine().toLowerCase();
        System.out.println();
        boolean found = false;

        for (Birds bird: birds) {
            if (bird.getName().toLowerCase().contains(birdName)) { // Obtenemos el nombre del ave y si contiene el nombre buscado procedemos
                int observationCount = bird.getObservations(); // Guardamos en una variable las observaciones que tengamos del ave buscada, por defecto 0
                bird.setObservations(observationCount + 1 ); //Cambiamos el parametro de observaciones del ave seleccionada con nuestra suma
                found = true;
                break; // Rompemos el bucle ya que encontramos el ave
            }
        }

        if (!found) { // Si después de recorrer todas las aves, ninguna coincidió, imprimimos el mensaje
            System.out.println("Not a bird");
        }
    }

    //Metodo para imprimir en pantalla todas las aves agregadas
    public void printBirds() {
        for(Birds bird: birds) {
            System.out.println(bird);
        }
    }

    public void printOneBird() {
        System.out.println("Bird?");
        String birdName = scanner.nextLine().toLowerCase();
        boolean found = false;
        for (Birds bird: birds) {
            if (bird.getName().toLowerCase().contains(birdName)) {
                System.out.println(bird);
                found = true;
                break;
            }
        }
        
        if (!found) {
            System.out.println("Not a bird!");
        }
    }
}
