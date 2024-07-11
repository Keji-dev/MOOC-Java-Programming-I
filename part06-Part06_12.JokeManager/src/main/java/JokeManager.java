import java.util.ArrayList;
import java.util.Random;

public class JokeManager {
    
    private ArrayList<String> jokeStorage;
    
    public JokeManager(){
        this.jokeStorage = new ArrayList<>();
    }
    
    public void addJoke(String joke) {
        this.jokeStorage.add(joke);
    }
    
    public String drawJoke() {
        Random random = new Random();
        
        if(jokeStorage.isEmpty()) {
            return "Jokes are in short supply.";
        }
        
        int index = random.nextInt(jokeStorage.size());
        
        return jokeStorage.get(index);    
    }
    
    public void printJokes() {
        for(String jokes: jokeStorage) {
            System.out.println(jokes);
        }
    }
}
