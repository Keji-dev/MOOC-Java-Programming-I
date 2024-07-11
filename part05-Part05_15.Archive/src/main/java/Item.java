public class Item {

    private String identifier;
    private String name;

    public Item(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }

    public boolean equals(Object compared) {
        
        if (this == compared) {
            return true;
        }

        if (!(compared instanceof Item)) {
            return false;
        }
        
        Item temp = (Item) compared;
        
        return this.identifier.equals(temp.identifier);
        
    }

    @Override
    public String toString() {
        return this.identifier + ": " + this.name;
    }
}

