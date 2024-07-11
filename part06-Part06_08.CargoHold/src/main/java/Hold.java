import java.util.ArrayList;

public class Hold {
    
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;
    private int suitcaseTotalWeight;

    public Hold(int maxWeight) {
        this.suitcases = new ArrayList<>();
        this.maxWeight = maxWeight;
    }
    
    public void addSuitcase(Suitcase suitcase) {
        
        this.suitcaseTotalWeight += suitcase.totalWeight();
        
        if (this.suitcaseTotalWeight <= maxWeight) {
            this.suitcases.add(suitcase);
        } else if (this.suitcaseTotalWeight > maxWeight) {
            this.suitcaseTotalWeight -= suitcase.totalWeight();
            this.suitcases.remove(suitcase);
        }  
    }
    
    public void printItems() {
        for(Suitcase suitcase: suitcases) {
            suitcase.printItems();
        }
    }
    
    @Override
    public String toString() {
        return this.suitcases.size() + " suitcases " + "(" + suitcaseTotalWeight + " kg)";
    }
    
   
    
}
