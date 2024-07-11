import java.util.ArrayList;

public class Birds {

    private String name;
    private String latinName;
    private int observations;
    private ArrayList<Birds> birds;

    public Birds(String name, String latinName, int observations) {
        this.name = name;
        this.latinName = latinName;
        this.observations = observations;
        this.birds = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getLatinName() {
        return latinName;
    }

    public int getObservations() {
        return observations;
    }

    public void setObservations(int observations) {
        this.observations = observations;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.latinName + "): " + this.observations + " observations\n";
    }
}
