public class Snacks {
    private int t = 20;
    private String brand;
    private int fatContent;
    private int weight;

    public Snacks(String brand, int fatContent, int weight){
        this.brand = brand;
        this.fatContent = fatContent;
        this.weight = weight;
    }
    public Snacks(String brand, int fatContent, int weight, int t){
        this(brand, fatContent, weight);
        this.t = t;
    }

    public String getBrand() {
        return brand;
    }
    public int getFatContent() {
        return fatContent;
    }
    public int getWeight() {
        return weight;
    }
    public int getT() {
        return t;
    }

    @Override
    public String toString() {
        return "\nBrand: " + brand 
             + "\nFatContent: " + fatContent 
             + "\nWeight: " + weight 
             + "\nT: " + t;
    }
}
    
       