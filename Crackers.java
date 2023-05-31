public class Crackers extends Snacks {
    private int t = 50;

    public Crackers(String brand, int fatContent, int weight) {
        super(brand, fatContent, weight);
    }
    public Crackers(String brand, int fatContent, int weight, int t) {
        super(brand, fatContent, weight, t);
    }

    @Override
    public String toString() {
        return "Crackers" + super.toString();
    } 
}
