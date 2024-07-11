import java.util.ArrayList;

public class Suitcase {
    
    private ArrayList<Item> items;
    private int maxWeight;
    private int itemsTotalWeight;

    
    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }
    
    public void addItem(Item item) {
        
        this.itemsTotalWeight += item.getWeight();
        
        if (this.itemsTotalWeight <= maxWeight) {
            this.items.add(item);
        } else if (this.itemsTotalWeight > maxWeight) {
            this.itemsTotalWeight -= item.getWeight();
            this.items.remove(item);
        }     
    }
    
    public void printItems() {
        for(Item item: items) {
            System.out.println(item);
        }
    }
    
    public int totalWeight() {
        
        int totalWeight = 0;
        
        for(Item item: items) {
            totalWeight += item.getWeight();
        }
        return totalWeight;
    }
    
    public Item heaviestItem() {
        if(this.items.isEmpty()) {
            return null;
        }
        
        Item heaviest = this.items.get(0);
        
        for (Item item: items) {
            if(heaviest.getWeight() < item.getWeight()) {
                heaviest = item;
            }
        }
        
        return heaviest;
    }
    
    
    @Override
    public String toString() {
        
        if(this.items.size() == 0) {
            return "no items " + "(" + this.itemsTotalWeight + " kg)";
        }
        
        if(this.items.size() == 1) {
            return this.items.size() + " item " + "(" + this.itemsTotalWeight + " kg)";
        }
        return this.items.size() + " items " + "(" + this.itemsTotalWeight + " kg)";
    }
    
    
    
}
