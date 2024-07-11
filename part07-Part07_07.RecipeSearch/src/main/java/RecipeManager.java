import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeManager {

    private ArrayList<String> ingredients; // Creamos un ArrayList para guardar los ingredientes
    private ArrayList<Recipe> listOfRecipes; // Creamos un ArrayList de tipo Recipe ya que todas las recetas estaran guardadas ahi

    public RecipeManager() {
        this.ingredients = new ArrayList<>(); // Tenemos que declarar la creacion de una ArrayList cuando usamos el constructor
        this.listOfRecipes = new ArrayList<>(); // Tenemos que declarar la creacion de una ArrayList cuando usamos el constructor
    }

    // El secreto de este metodo es que el archivo (recipes.txt) en este caso, siga un esquema, el contenido del archivo y el loop deben ser 1:1, siempre debemos colocar las variables exactamente en la linea de lo que queremos guardar del archivo y si hay muchas lineas que queremos guardarlas usamos un nested loop
    // en caso de que necesitemos agregar otro trozo de texto, lo rompemos con una linea en blanco en el texto y en nuestro neste loop usando .isEmpty(), asi nuestro esquema se repetira, el contenido del documento debe estar siempre en el mismo formato
    //
    public void readRecipe(String fileName) { // Metodo para leer la receta

        try (Scanner input = new Scanner(new File(fileName))) { // Debemos inicializar un try & catch usando el scanner para leer nuestro archivo

            while (input.hasNextLine()) { // Mientras que nuestro archivo tenga una linea la cual leer, esto va a leer todas las lineas del documentos 1 por 1. Por lo que cada vez que declaremos un input.nextLine() quiere decir que la siguiente linea se va a leer y guardar como nosotros queramos
                String recipeName = input.nextLine(); // ESTA ES LA LINEA 1: La primera linea del texto es "Pancake dough" por lo que estamos haciendo es guardar la primera linea en la variable recipeName, podemos especificar que se va a guardar o hacer linea por linea, en este caso guardar la variable
                int cookingTime = Integer.valueOf(input.nextLine()); // ESTA ES LA LINEA 2: Guardamos la segunda linea, como es un numero podemos pasar de String a int y guardarlo como int en la variable cookingTime
                Recipe recipe = new Recipe(recipeName, cookingTime); // Creamos una nueva receta, pasamos los atributos recipeName (linea 1) y cookingTime (linea 2), ya tenemos nuestra primera receta
                listOfRecipes.add(recipe); // Agregamos nuestra receta a un ArrayList, asi tendremos todas las recetas guardas en un mismo sitio

                while (input.hasNextLine()) { // Hacemos otro bucle porque queremos que las siguientes lineas se lean para agregarlas a ingredientes, en este caso son varias lineas es por ello que lo ponemos en un bucle diferente para que recipeName y cookingTime no agregue mas lineas
                    String ingredient = input.nextLine(); // ESTA ES LA LINEA 3 DONDE SE ENCUENTRA EL PRIMER INGREDIENTE: Guardamos la linea con el ingrediente
                    if (ingredient.isEmpty()) { // Mientras que no haya una linea vacia, todas las lineas hasta ese punto van a ser agregadas a ingredientes, cuando lleguemos a una linea vacia, el loop se rompe y ya no se consideraran ingredientes porque volvemos al loop padre a leer las lines RecipeName
                        break;
                    }
                    recipe.addIngredients(ingredient); // Agregamos todas las lineas como ingredientes a nuestra ArrayList de ingredientes
                }
            }

        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }

    }

    public void listRecipes() {
        System.out.println("Recipes: ");
        for (Recipe recipe: listOfRecipes) { // Recorremos todas las recetas guardadas en el ArrayList
            System.out.println(recipe); // Imprimimos en pantalla las recetas
        }
    }

    public void findName(String nameToSearch) {
        System.out.println("Recipes: ");
        for (Recipe recipe: listOfRecipes) { // Recorremos todas las recetas guardadas en el ArrayList
            if (recipe.getRecipeName().contains(nameToSearch)) { // Si en el ArrayList obteniendo el nombre con getRecipename, contiene el valor que escribimos, que se imprima esa receta
                System.out.println(recipe);
            }
        }
    }

    public void findCookingTime(int maxCookingTime) {
        System.out.println("Recipes: ");
        for(Recipe recipe: listOfRecipes) { // Recorremos todas las recetas guardadas en el ArrayList
            if (recipe.getCookingTime() <= maxCookingTime) { // Si en el ArrayList obteniendo el tiempo con getCookingTime es menor o igual al tiempo maximo que hayamos escrito, imprime las recetas con ese tiempo maximo
                System.out.println(recipe);
            }
        }
    }

    public void findIngredient(String ingredient) {
        for (int i = 0; i < listOfRecipes.size(); i++) { // Recorremos con un indice el size de la lista de recetas, en este caso 3
            if (listOfRecipes.get(i).getIngredients().contains(ingredient)) { // Si en la receta numero 1 en el indice 0, obtenemos los ingredientes y contiene el ingrediente escritor, imprime la receta en ese indice
                System.out.println(listOfRecipes.get(i));
            }
        }
    }
}
