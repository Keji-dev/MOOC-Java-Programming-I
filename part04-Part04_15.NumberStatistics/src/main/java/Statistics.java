
public class Statistics {
   private int count;
    private int sum;

    public Statistics() {
        this.count = count;
        this.sum = sum;
    }

    public void addNumber(int number) {
        count++;
        this.sum += number;
    }

    public int getCount() {
        return this.count;
    }

    public int sum() {
        return this.sum;
    }

    public double average(){
        if(this.count != 0) {
            return this.sum / (double) this.count;
        }
        return 0;
    }
}
