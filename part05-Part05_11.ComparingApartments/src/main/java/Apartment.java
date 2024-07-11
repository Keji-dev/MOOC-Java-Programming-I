
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    
    public boolean largerThan(Apartment compared) {
        if (this.squares < compared.squares) {
            return false;
        }
        return true;
    }
    
    public int priceDifference(Apartment compared) {
    
        int price = this.princePerSquare * this.squares;

        int comparison = compared.princePerSquare * compared.squares;
        
        int difference = price - comparison;
  
        return Math.abs(difference);
    }
    
    public boolean moreExpensiveThan(Apartment compared) {
        
        int price = this.princePerSquare * this.squares;

        int comparison = compared.princePerSquare * compared.squares;
    
        if(price < comparison) {
            return false;
        }
        return true;
    }

}
