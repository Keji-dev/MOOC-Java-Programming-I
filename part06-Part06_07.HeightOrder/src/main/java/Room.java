import java.util.ArrayList;

public class Room {
    
    private ArrayList<Person> room;
            
    public Room() {
        this.room = new ArrayList<>();
    }
    
    public void add(Person person) {
        room.add(person);
    }
    
    public boolean isEmpty() {
        if(room.isEmpty()) {
            return true;
        }
        return false;
    }
    
    public ArrayList<Person> getPersons() {
        return this.room;
    }
    
    public Person shortest() {
        if(room.isEmpty()) {
            return null;
        }
        
        Person shortest = this.room.get(0);
        
        for(Person per: room) {
            if(shortest.getHeight() > per.getHeight()) {
                shortest = per;
            }
        }
        
        return shortest;
    }
    
    public Person take() {
        if(room.isEmpty()) {
            return null;
        }
        
        Person shortest = shortest();
        
        room.remove(shortest);
        
        return shortest;
    }
    
}

