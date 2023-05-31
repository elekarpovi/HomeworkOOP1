public class Chips extends Snacks {
    private int t = 40;

    public Chips(String brand, int fatContent, int weight) {
        super(brand, fatContent, weight);
    }
    public Chips(String brand, int fatContent, int weight, int t) {
        super(brand, fatContent, weight, t);
    }

    @Override
    public String toString() {
        return "Chips" + super.toString();
    }
}
