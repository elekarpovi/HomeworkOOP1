public class Chocolate  extends Snacks{
    private int t = 30;

    public Chocolate(String brand, int fatContent, int weight) {
        super(brand, fatContent, weight);
    }
    public Chocolate(String brand, int fatContent, int weight, int t) {
        super(brand, fatContent, weight, t);
    }

    @Override
    public String toString() {
        return "Chocolate" + super.toString();
    }
}

