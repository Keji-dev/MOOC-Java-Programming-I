import java.util.ArrayList;
import java.util.List;

public class Recipe {

    private String recipeName; // Atributo para el nombre de la receta
    private int cookingTime; // Atributo para el tiempo de la receta
    private List<String> ingredients; //Atributo List de ingredientes tipo String para guardar todos los ingredientes

    public Recipe(String recipeName, int cookingTime) {
        this.recipeName = recipeName;
        this.cookingTime = cookingTime;
        this.ingredients = new ArrayList<>(); // Siempre debemos inicializar el ArrayList en el constructor
    }

    @Override
    public String toString() {
        return this.recipeName + ", cooking time: " + this.cookingTime; // Cada vez que llamemos a recipe, este mensaje se imprimira
    }

    // Usamos este metodo para agregar los ingredientes a nuestra lista
    public void addIngredients(String ingredient) {
        this.ingredients.add(ingredient);
    }

    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public int getCookingTime() {
        return cookingTime;
    }

    // Metodo para obtener los ingredientes
    public List<String> getIngredients() {
        return ingredients;
    }


}
